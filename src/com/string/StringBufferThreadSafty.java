package com.string;

public class StringBufferThreadSafty implements Runnable{

	private StringBuffer s;

	public StringBufferThreadSafty(StringBuffer s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println("In run method: "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s.append(Thread.currentThread().getName());
		System.out.println("String: "+s);
	}
	
	public static void main(String[] args) throws InterruptedException {
		StringBuffer str=new StringBuffer("Thread ");
		Thread t1=new Thread(new StringBufferThreadSafty(str));
		Thread t2=new Thread(new StringBufferThreadSafty(str));
		Thread t3=new Thread(new StringBufferThreadSafty(str));
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("String is: "+str);
	}
}

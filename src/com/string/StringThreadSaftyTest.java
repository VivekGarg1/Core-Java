package com.string;

public class StringThreadSaftyTest implements Runnable{

	private String s;

	public StringThreadSaftyTest(String s) {
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
		s=s+Thread.currentThread().getName();
		System.out.println("String: "+s);
	}
	
	public static void main(String[] args) throws InterruptedException {
		String str="Thread ";
		Thread t1=new Thread(new StringThreadSaftyTest(str));
		Thread t2=new Thread(new StringThreadSaftyTest(str));
		Thread t3=new Thread(new StringThreadSaftyTest(str));
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("String is: "+str);
	}
}

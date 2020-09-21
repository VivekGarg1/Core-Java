package com.multithreading;

public class JoinClientTest {

	public static void main(String[] args) throws InterruptedException {
		
		JoinCounter r=new  JoinCounter();
		Thread t1=new Thread(r,"T1");
		Thread t2=new  Thread(r,"T2");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Counter final value: "+r.getCount());
	}

}

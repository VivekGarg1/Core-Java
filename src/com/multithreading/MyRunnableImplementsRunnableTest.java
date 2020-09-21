package com.multithreading;

public class MyRunnableImplementsRunnableTest {

	public static void main(String[] args) {
		
		MyThread r=new  MyThread();
		Thread t1=new Thread(r,"T1");
		Thread t2=new  Thread(r,"T2");
		t1.start();
		t2.start();
	}

}

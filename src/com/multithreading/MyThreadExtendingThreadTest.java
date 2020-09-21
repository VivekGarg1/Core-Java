package com.multithreading;

public class MyThreadExtendingThreadTest {

	public static void main(String[] args) {
		
		MyThread t1=new  MyThread();
		t1.setName("T1");
		MyThread t2=new  MyThread();
		t2.setName("T2");
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		t2.start();
	}

}

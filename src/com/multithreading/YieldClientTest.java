package com.multithreading;

public class YieldClientTest {

	public static void main(String[] args) {
		YieldThread r=new YieldThread();
		
		Thread t1=new Thread(r,"T1");
		Thread t2=new  Thread(r,"T2");
		t1.start();
		t2.start();
	}

}

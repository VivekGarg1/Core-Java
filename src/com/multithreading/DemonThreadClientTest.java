package com.multithreading;

public class DemonThreadClientTest {

	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.isDaemon());
		System.out.println(currentThread.getName()+" thread start");
		MyThread t=new MyThread();
		t.setName("T1");
		t.setDaemon(true);
		t.start();
		System.out.println(currentThread.getName()+" thread end");
	}

}

package com.multithreading;

public class DeadlockClientTest {

	public static void main(String[] args) {
		Object lock1=new Object();
		Object lock2=new Object();
		
		DeadlockThread1 r1=new DeadlockThread1(lock1, lock2);
		DeadlockThread2 r2=new DeadlockThread2(lock1, lock2);
		
		Thread t1=new Thread(r1, "T1");
		Thread t2=new Thread(r2, "T2");
		
		t1.start();
		t2.start();
	}

}

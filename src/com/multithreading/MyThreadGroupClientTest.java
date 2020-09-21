package com.multithreading;

public class MyThreadGroupClientTest {

	public static void main(String[] args) {
		
		MyRunnable r=new MyRunnable();
		ThreadGroup threadGroup1=new ThreadGroup("groupA");
		ThreadGroup threadGroup2=new ThreadGroup("groupA");
		
		Thread t1=new Thread(threadGroup1,r,"T1");
		Thread t2=new Thread(threadGroup1,r,"T2");
		Thread t3=new Thread(threadGroup1,r,"T3");
		
		Thread t4=new Thread(threadGroup2,r,"T4");
		Thread t5=new Thread(threadGroup2,r,"T5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		threadGroup1.setMaxPriority(Thread.MAX_PRIORITY);
		int activeCount = threadGroup1.activeCount();
		System.out.println(activeCount);
		threadGroup2.list();
	}

}

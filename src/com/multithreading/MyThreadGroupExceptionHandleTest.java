package com.multithreading;

public class MyThreadGroupExceptionHandleTest {

	public static void main(String[] args) throws Exception {
		
		MyThreadGroup threadGroup=new MyThreadGroup("MyThreadGroup");
		Thread t=new Thread(threadGroup, new MyRunnable(), "T1");
		t.start();
	}
}

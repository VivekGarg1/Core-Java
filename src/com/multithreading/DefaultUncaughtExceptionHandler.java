package com.multithreading;

public class DefaultUncaughtExceptionHandler {

	public static void main(String[] args) {
		
		Thread.setDefaultUncaughtExceptionHandler((t,e)-> {
			System.out.println(t.getName()+" thread ends with following exception::");
			System.out.println(e.getMessage());
		});
		Thread t=new Thread(new MyRunnable(),"T1");
		t.start();
	}

}

package com.multithreading;

public class UncaughtExceptionHandleTest {

	public static void main(String[] args) throws Exception {
		
		Thread.currentThread().setUncaughtExceptionHandler((t,e)-> {
			System.out.println(t.getName()+" thread ends with following exception::");
			System.out.println(e.getMessage());
		});
		throw new Exception("Exception thrown from somewhere in your program");
	}

}

package com.multithreading;

import java.util.concurrent.TimeUnit;

public class ExecutorThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("My Task3 started..");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("My Task3 end..");
	}

}

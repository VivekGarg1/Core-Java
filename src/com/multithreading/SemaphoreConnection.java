package com.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreConnection {

	private static SemaphoreConnection INSTANCE = new SemaphoreConnection();
	private int noOfConnection;
	private Semaphore semaphore=new Semaphore(10, true);

	private SemaphoreConnection() {

	}

	public static SemaphoreConnection getConnection() {
		return INSTANCE;
	}

	public void connect() {
		try {
			semaphore.acquire();
			synchronized (this) {
				noOfConnection++;
				System.out.println("Current connections: " + noOfConnection);
			}
			
			Thread.sleep(2000);
			
			synchronized (this) {
				noOfConnection--;
				System.out.println("After release Current connections: " + noOfConnection);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (semaphore != null) {
				semaphore.release(); 
			}
		}
	}
}

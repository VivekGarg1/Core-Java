package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileClientTest {

	public static void main(String[] args) {
		ExecutorService executorService = null;
		try {
			executorService = Executors.newFixedThreadPool(5);
			Runnable task1 = new Runnable() {
				@Override
				public void run() {
					for (int i = 1; i <= 100; i++) {
						VolatileSingleton singleton=VolatileSingleton.getInstance();
						System.out.println(singleton.hashCode());
					}
				}
			};

			Runnable task2 = new Runnable() {
				@Override
				public void run() {
					for (int i = 1; i <= 100; i++) {
						VolatileSingleton singleton=VolatileSingleton.getInstance();
						System.out.println(singleton.hashCode());
					}
				}
			};
			
			executorService.submit(task1);
			executorService.submit(task2);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executorService != null)
				executorService.shutdown();
		}
	}

}

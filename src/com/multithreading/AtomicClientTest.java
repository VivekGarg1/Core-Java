package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicClientTest {

	public static void main(String[] args) {

		ExecutorService executorService = null;
		AtomicCounter counter = new AtomicCounter();
		try {
			executorService = Executors.newFixedThreadPool(2);

			Runnable task1 = () -> {
				for (int i = 1; i <= 2000; i++) {
					counter.increment();
				}
			};

			Runnable task2 = () -> {
				for (int i = 1; i <= 8000; i++) {
					counter.increment();
				}
			};
			executorService.submit(task1);
			executorService.submit(task2);
			executorService.awaitTermination(1, TimeUnit.SECONDS);
			System.out.println("Final counter value: " + counter.getValue());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			if(executorService !=null)
				executorService.shutdown();
		}
	}

}

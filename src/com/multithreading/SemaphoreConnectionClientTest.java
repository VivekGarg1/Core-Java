package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SemaphoreConnectionClientTest {

	public static void main(String[] args) {
		ExecutorService executorService=null;
		try {
			executorService=Executors.newCachedThreadPool();
			for (int i = 1; i <= 300; i++) {
				executorService.submit(new Runnable() {
					
					@Override
					public void run() {
							SemaphoreConnection.getConnection().connect();
						}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (executorService != null) {
				executorService.shutdown();
			}
		}
	}
}

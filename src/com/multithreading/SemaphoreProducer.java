package com.multithreading;

import java.util.Random;

public class SemaphoreProducer implements Runnable {

	private SemaphoreMyQueue sharedQueue;

	public SemaphoreProducer(SemaphoreMyQueue sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			Random random = new Random();
			Integer data = random.nextInt(100);
			try {
				sharedQueue.put(data);
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}

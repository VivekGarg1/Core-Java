package com.multithreading;

public class SemaphoreConsumer implements Runnable {

	private SemaphoreMyQueue sharedQueue;

	public SemaphoreConsumer(SemaphoreMyQueue sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				sharedQueue.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

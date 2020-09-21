package com.multithreading;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueConsumer implements Runnable {

	private BlockingQueue<Integer> sharedQueue;

	public BlockingQueueConsumer(BlockingQueue<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			Integer data;
			try {
				data = sharedQueue.take();
				System.out.println("Consumed: " + data);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

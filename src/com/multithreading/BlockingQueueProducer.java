package com.multithreading;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducer implements Runnable {

	private BlockingQueue<Integer> sharedQueue;
	private final int MAX_SIZE = 5;

	public BlockingQueueProducer(BlockingQueue<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			Random random = new Random();
			Integer data = random.nextInt(MAX_SIZE);
			try {
				sharedQueue.put(data);
				System.out.println("Produced: " + data);
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}

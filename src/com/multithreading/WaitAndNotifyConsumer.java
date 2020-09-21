package com.multithreading;

import java.util.Queue;

public class WaitAndNotifyConsumer implements Runnable {

	private Queue<Integer> sharedQueue;
	
	public WaitAndNotifyConsumer(Queue<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (sharedQueue) {
				while (sharedQueue.isEmpty()) {
					System.out.println("Consumer is waiting to produce object by WaitAndNotifyProducer..");
					try {
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Integer data = sharedQueue.poll();
				System.out.println("Consumed: "+data);
				sharedQueue.notify();
			}
		}
	}

}

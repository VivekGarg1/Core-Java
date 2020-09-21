package com.multithreading;

import java.util.Queue;
import java.util.Random;

public class WaitAndNotifyProducer implements Runnable {

	private Queue<Integer> sharedQueue;
	private final int MAX_SIZE=5;
	
	public WaitAndNotifyProducer(Queue<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (sharedQueue) {
				while (sharedQueue.size()==5) {
					System.out.println("WaitAndNotifyProducer is waiting to consume object by Consumer..");
					try {
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Random random=new Random();
				Integer data = random.nextInt(MAX_SIZE);
				sharedQueue.add(data);
				System.out.println("Produced: "+data);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sharedQueue.notify();
			}
		}
	}

}

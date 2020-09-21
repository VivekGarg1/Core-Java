package com.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreMyQueue {

	private int item;
	private Semaphore semaphoreConsumer=new Semaphore(0);
	private Semaphore semaphoreProducer=new Semaphore(1);
	
	public void get() {
		try {
			semaphoreConsumer.acquire();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		System.out.println("Consumer consumed item: "+item);
		semaphoreProducer.release();
	}
	
	public void put(int item) {
		try {
			semaphoreProducer.acquire();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		this.item=item;
		System.out.println("Producer produced item: "+item);
		semaphoreConsumer.release();
	}
}

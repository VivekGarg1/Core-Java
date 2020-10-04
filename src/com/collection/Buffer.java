package com.collection;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Buffer {

	private Queue<Integer> queue=new ConcurrentLinkedQueue<Integer>();
	
	public void get() {
		System.out.println("Consumer received - "+queue.poll());
	}
	
	public void put(int i) {
		queue.add(i);
		System.out.println("Producer produced - "+i);
	}
}

package com.collection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentLinkedQueueTest {

	public static void main(String[] args) {
		Buffer buffer=new Buffer();
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		executorService.execute(new Producer(buffer));
		
		executorService.execute(new Consumer(buffer));
		executorService.execute(new Consumer(buffer));
		executorService.execute(new Consumer(buffer));
		executorService.shutdown();
	}

}

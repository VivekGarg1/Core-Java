package com.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducerAndConsumerTest {

	public static void main(String[] args){
		
		BlockingQueue<Integer> sharedQueue=new ArrayBlockingQueue<>(5);
		
		BlockingQueueProducer producer=new BlockingQueueProducer(sharedQueue);
		BlockingQueueConsumer consumer=new BlockingQueueConsumer(sharedQueue);
		
		Thread produceThread=new Thread(producer);
		Thread consumeThread=new Thread(consumer);
		
		produceThread.start();
		consumeThread.start();
	}

}

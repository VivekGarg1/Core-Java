package com.multithreading;

public class SemaphoreProducerAndConsumerTest {

	public static void main(String[] args){
		
		SemaphoreMyQueue sharedQueue=new SemaphoreMyQueue();
		
		SemaphoreProducer producer=new SemaphoreProducer(sharedQueue);
		SemaphoreConsumer consumer=new SemaphoreConsumer(sharedQueue);
		
		Thread produceThread=new Thread(producer);
		Thread consumeThread=new Thread(consumer);
		
		produceThread.start();
		consumeThread.start();
	}

}

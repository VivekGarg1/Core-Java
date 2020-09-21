package com.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class WaitAndNotifyProducerAndConsumerTest {

	public static void main(String[] args){
		
		Queue<Integer> sharedQueue=new LinkedList<>();
		
		WaitAndNotifyProducer waitAndNotifyProducer=new WaitAndNotifyProducer(sharedQueue);
		WaitAndNotifyConsumer consumer=new WaitAndNotifyConsumer(sharedQueue);
		
		Thread produceThread=new Thread(waitAndNotifyProducer);
		Thread consumeThread=new Thread(consumer);
		
		produceThread.start();
		consumeThread.start();
	}

}

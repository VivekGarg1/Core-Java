package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConditionApiProducerConsumerTest {

	public static void main(String[] args) {
		ExecutorService executorService = null;
		try {
			executorService = Executors.newFixedThreadPool(2);
			final ConditionApiProducerConsumer producerConsumer=new ConditionApiProducerConsumer();
			Runnable producerTask = new Runnable() {

				@Override
				public void run() {
					while (true) {
						try {
							producerConsumer.pushToStack();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			
			Runnable consumerTask = new Runnable() {

				@Override
				public void run() {
					while (true) {
						try {
							producerConsumer.popFromStack();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			
			executorService.submit(producerTask);
			executorService.submit(consumerTask);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executorService != null) {
				executorService.shutdown();
			}
		}
	}

}

package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsWithMultipleThreadTest {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Runnable task1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My Task1 started..");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("My Task1 end..");
			}
		};
		
		Runnable task2=()->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task2 started..");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("My Task2 end..");
			};
			
			ExecutorThread task3=new ExecutorThread();
			
			executorService.submit(task1);
			executorService.submit(task2);
			executorService.submit(task3);
			
			executorService.shutdown();
	}

}

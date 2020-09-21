package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsWithSngleThreadTest {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Runnable task1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My Task1..");
			}
		};
		
		Runnable task2=()->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task2..");
			};
			
			ExecutorThread task3=new ExecutorThread();
			
			executorService.submit(task1);
			executorService.submit(task2);
			executorService.submit(task3);
			
			executorService.shutdown();
	}

}

package com.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInvokeAllClientTest {

	public static void main(String[] args) {
		ExecutorService executorService = null;
		try {

			executorService=Executors.newFixedThreadPool(3);
			Callable<String> task1 = new Callable<String>() {

				@Override
				public String call() throws Exception {
					Thread.sleep(1000);
					return "Result of Task1..";
				}
			};

			Callable<String> task2 = new Callable<String>() {

				@Override
				public String call() throws Exception {
					Thread.sleep(1000);
					return "Result of Task2..";
				}
			};

			Callable<String> task3 = new Callable<String>() {

				@Override
				public String call() throws Exception {
					Thread.sleep(1500);
					return "Result of Task3..";
				}
			};
			
			List<Callable<String>> taskList=new ArrayList<>();
			taskList.add(task1);
			taskList.add(task2);
			taskList.add(task3);
			
			List<Future<String>> invokeAll = executorService.invokeAll(taskList);
			for (Future<String> future : invokeAll) {
				System.out.println(future.get());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(executorService!=null)
				executorService.shutdown();
		}
	}

}

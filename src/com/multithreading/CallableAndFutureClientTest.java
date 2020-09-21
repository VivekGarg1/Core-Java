package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureClientTest {

	public static void main(String[] args) {

		Callable<String> task1 = new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "My Task is done";
			}
		};

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> future = executorService.submit(task1);
		if (future.isDone()) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		CallableThread task2 = new CallableThread(10);
		Future<Integer> future2 = executorService.submit(task2);
		try {
			System.out.println(future2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		Callable<String> task3 = () -> {
			return "My Task3 is done";
		};
		Future<String> future3 = executorService.submit(task3);
		try {
			System.out.println(future3.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		Callable<Integer> task4 = () -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0)
					sum = sum + i;
			}
			return sum;
		};
		Future<Integer> future4 = executorService.submit(task4);
		try {
			System.out.println("Even no's sum: " + future4.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		Callable<Integer> task5 = () -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 1)
					sum = sum + i;
			}
			return sum;
		};
		Future<Integer> future5 = executorService.submit(task5);
		try {
			System.out.println("Odd no's sum: " + future5.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		executorService.shutdown();
	}
}

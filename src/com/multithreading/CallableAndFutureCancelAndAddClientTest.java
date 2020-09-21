package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableAndFutureCancelAndAddClientTest {

	public static void main(String[] args) {

		ExecutorService executorService = null;
		try {
			executorService = Executors.newSingleThreadExecutor();
			long sTime = System.currentTimeMillis();
			Future<String> future = executorService.submit(new CallableCancelThread(new CallableCancelRemoteService()));
			while (!future.isDone()) {
				long totalTime = System.currentTimeMillis() - sTime;
				if (totalTime > 20) {
					System.out.println("Task is taking so long time to execute so cancel it..");
					future.cancel(true);
				}
			}
			System.out.println("Result: "+future.get(2,TimeUnit.SECONDS));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(executorService != null)
				executorService.shutdown();
		}
	}
}

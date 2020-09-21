package com.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsScheduledTest {

	public static void main(String[] args) {
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
			
			ExecutorThread task=new ExecutorThread();
			
			executorService.schedule(task, 5, TimeUnit.SECONDS);
			
			executorService.shutdown();
	}

}

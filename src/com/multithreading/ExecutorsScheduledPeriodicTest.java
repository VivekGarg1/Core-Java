package com.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsScheduledPeriodicTest {

	public static void main(String[] args) {
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
			
			ExecutorThread task=new ExecutorThread();
			
			executorService.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);
	}

}

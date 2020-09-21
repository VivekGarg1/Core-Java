package com.multithreading;

public class YieldThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName+"\t"+"i= "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(threadName.equalsIgnoreCase("T1"))
				Thread.yield();
		}
	}

}

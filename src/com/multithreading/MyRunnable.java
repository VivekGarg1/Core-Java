package com.multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(Thread.currentThread().getName()+"\t"+"i= "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*if(i==5)
				throw new RuntimeException("My Runtime exception");*/
		}
	}

}

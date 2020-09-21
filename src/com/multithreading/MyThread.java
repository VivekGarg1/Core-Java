package com.multithreading;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(Thread.currentThread().getName()+"\t"+"i= "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

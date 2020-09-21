package com.multithreading;

public class JoinCounter implements Runnable{

	private int counter;
	
	@Override
	public void run() {
		for (int i = 1; i <=2000; i++) {
			/*synchronized (this) {
				counter++;
			}*/
			increment();
		}
	}
	private synchronized void increment() {
		counter++;
	}
	public int getCount() {
		return counter;
	}

}

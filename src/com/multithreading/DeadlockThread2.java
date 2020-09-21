package com.multithreading;

public class DeadlockThread2 implements Runnable {

	private Object lock1;
	private Object lock2;
	
	public DeadlockThread2(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		synchronized(lock2) {
			System.out.println(Thread.currentThread().getName()+" locked resource 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
			synchronized(lock1) {
				System.out.println(Thread.currentThread().getName()+" locked resource 1");
			}
		}
	}

}

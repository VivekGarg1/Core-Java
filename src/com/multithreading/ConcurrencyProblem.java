package com.multithreading;

public class ConcurrencyProblem {

	static int arr[]= {0};
	public static void main(String[] args) throws InterruptedException {
		
		final ConcurrencyProblem concurrencyProblem=new ConcurrencyProblem();
		Thread a=new Thread("A") {
			public void run() {
				for (int i = 1; i <=1000; i++) {
					concurrencyProblem.increment();
				}
			};
		};
		
		Thread b=new Thread("B") {
			public void run() {
				for (int i = 1; i <=1000; i++) {
					concurrencyProblem.decrement();
				}
			};
		};
		a.start();
		b.start();
		a.join();
		b.join();
		System.out.println(arr[0]);
	}
	protected synchronized void decrement() {
		arr[0]--;
	}
	protected synchronized void increment() {
		arr[0]++;
	}

}

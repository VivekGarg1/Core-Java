package com.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierPassangerThread extends Thread {

	private int duration;
	private CyclicBarrier cyclicBarrier;

	public CyclicBarrierPassangerThread(int duration, CyclicBarrier cyclicBarrier, String pName) {
		super(pName);
		this.duration = duration;
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName()+" is arrieved..");
			int await = cyclicBarrier.await();
			if (await==0) {
				System.out.println("Four passanger has arrived now cab is going to start..");
				}
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}

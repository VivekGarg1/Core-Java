package com.multithreading;

import java.util.concurrent.Semaphore;

public class OddAndEvenNumberGenerator {

	Semaphore semaphoreOdd=new Semaphore(1);
	Semaphore semaphoreEven=new Semaphore(0);
	
	public void printOddNumber(int num) {
		try {
			semaphoreOdd.acquire();
			System.out.println(Thread.currentThread().getName()+" : "+num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
				semaphoreEven.release();
		}
	}
		
		public void printEvenNumber(int num) {
			try {
				semaphoreEven.acquire();
				System.out.println(Thread.currentThread().getName()+" : "+num);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
					semaphoreOdd.release();
			}
	}
}

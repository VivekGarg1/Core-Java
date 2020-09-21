package com.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

	//private volatile int counter;
	private AtomicInteger counter =new AtomicInteger(0);
	
	/*public int getValue(){
		return counter;
	}
	
	public synchronized int increment(){
		return counter++;
	}*/
	
	public int getValue(){
		return counter.get();
	}
	
	public synchronized int increment(){
		return counter.getAndIncrement();
	}
}

package com.collection;

public class Consumer implements Runnable{

	private Buffer buffer;

	public Consumer(Buffer buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		buffer.get();
	}
	
	
}

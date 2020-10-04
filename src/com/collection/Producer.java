package com.collection;

public class Producer implements Runnable{

	private Buffer buffer;

	public Producer(Buffer buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			buffer.put(i);
		}
	}
	
	
}

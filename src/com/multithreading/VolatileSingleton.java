package com.multithreading;

public class VolatileSingleton {

	private volatile static VolatileSingleton singleton;
	
	private VolatileSingleton() {
		
	}
	
	public static VolatileSingleton getInstance() {
		if(singleton == null) {
			synchronized (VolatileSingleton.class) {
				//check agail as multiple threads cn reach above step
				if (singleton == null) {
					singleton=new VolatileSingleton();
				}
			}
		}
		return singleton;
	}
}

package com.multithreading;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {

	private Integer number;

	public CallableThread(Integer number) {
		super();
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int sum=0;
		for (int i = 1; i <= number; i++) {
			sum=sum+i;
		}
		return sum;
	}

}

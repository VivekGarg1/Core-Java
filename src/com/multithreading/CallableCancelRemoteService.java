package com.multithreading;

public class CallableCancelRemoteService {

	public String remoteService() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Remote Service";
	}
}

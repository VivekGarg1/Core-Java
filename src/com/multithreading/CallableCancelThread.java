package com.multithreading;

import java.util.concurrent.Callable;

public class CallableCancelThread implements Callable<String> {

	private CallableCancelRemoteService callableCancelRemoteService;

	public CallableCancelThread(CallableCancelRemoteService callableCancelRemoteService) {
		super();
		this.callableCancelRemoteService = callableCancelRemoteService;
	}

	@Override
	public String call() throws Exception {
		return callableCancelRemoteService.remoteService();
	}

}

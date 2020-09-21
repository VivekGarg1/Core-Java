package com.multithreading;

public class MyThreadGroup extends ThreadGroup {

	public MyThreadGroup(String name) {
		super(name);
	}
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		ThreadGroup  threadGroup=t.getThreadGroup();
		System.out.println(threadGroup);
		System.out.println(t.getName()+" thread ends with following exception::");
		System.out.println(e.getMessage());
	}

}

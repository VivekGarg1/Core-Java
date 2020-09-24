package com.oops;

public class MyClassImpl1 implements MyInterface {

	@Override
	public void display(String message) {
		System.out.println("Message is: "+message);
	}

	@Override
	public String getValue(String message) {
		return "Hello "+message;
	}

}

package com.reflection;

public class NewInstance {

	private int value;
	private String name;
	
	@SuppressWarnings("unused")
	private NewInstance() {
	}

	public NewInstance(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public void showValue() {
		System.out.println("name: "+name+"\t"+" Value is: "+value);
	}
	
}

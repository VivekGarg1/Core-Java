package com.reflection;

public class Child extends Parent implements IntTest {

	private int value;
	
	public Child(String name,int value) {
		super(name);
		this.value=value;
	}

	@Override
	public void showValue() {
		System.out.println("Value is: "+value);
	}

}

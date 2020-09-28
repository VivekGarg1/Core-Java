package com.reflection;

public class Parent {

	private String name;

	public Parent(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void displayName() {
		System.out.println(name);
	}
}

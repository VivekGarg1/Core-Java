package com.oops;

public class Child extends Parent{
	private int j;

	Child(int i, int j) {
		super(i);
		this.j = j;
	}

	public void display() {
		System.out.println("Value of j is: " +j);
	}
}

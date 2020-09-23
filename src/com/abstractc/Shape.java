package com.abstractc;

public abstract class Shape {

	private int length;
	private int breadth;

	public Shape(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public abstract void area();

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

}

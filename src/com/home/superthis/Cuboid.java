package com.home.superthis;

public class Cuboid extends Shape {

	private int height;

	public Cuboid(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

}

package com.oops;

public class Rectangle extends Shape{

	public Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	@Override
	public void area() {
		System.out.println("Area of rectangle is: "+getLength()*getBreadth());
	}

}

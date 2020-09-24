package com.oops;

public class Triangle extends Shape{

	public Triangle(int length, int breadth) {
		super(length, breadth);
	}

	@Override
	public void area() {
		System.out.println("Area of triange is: "+(getLength()*getBreadth())/2);
	}

}

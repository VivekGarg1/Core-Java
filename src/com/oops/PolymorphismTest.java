package com.oops;

public class PolymorphismTest {

	public static void main(String[] args) {
		Shape shape;
		Triangle triangle=new Triangle(10,20);
		Rectangle rectangle=new Rectangle(10, 20);
		shape=triangle;
		shape.area();
		shape=rectangle;
		shape.area();
	}

}

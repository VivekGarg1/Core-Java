package com.oops;

public class B extends A{

	public int c=10;
	public void displayFromB() {
		System.out.println("Value of a: "+a);
		displayFromA();
		System.out.println("Value of c: "+c);
	}
}

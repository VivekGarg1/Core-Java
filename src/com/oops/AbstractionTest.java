package com.oops;

public class AbstractionTest {

	public static void main(String[] args) {
		MyInterface myInterface=new MyClassImpl1();
		myInterface.display("Hello Oops Concept..");
		String value = myInterface.getValue("Oops Concept..");
		System.out.println(value);
	}

}

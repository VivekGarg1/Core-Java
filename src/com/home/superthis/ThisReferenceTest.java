package com.home.superthis;

public class ThisReferenceTest {

	private int id;
	private String name;

	public ThisReferenceTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("Emp Id: "+id+", Name: "+name);
		System.out.println("Reference of this: "+this);
	}
	
	public static void main(String[] args) {
		ThisReferenceTest test=new ThisReferenceTest(1, "Vive Garg");
		test.display();
		System.out.println("Reference of ThisReferenceTest: "+test);
	}

}

package com.home.superthis;

public class ThisReferenceTest2 {

	private int id=1;
	private String name="Vivek Garg";

	public void display() {
	    int id=2;
		String name="Shubham";
		System.out.println("Emp Id: "+id+", Name: "+name);
		System.out.println("Emp Id: "+this.id+", Name: "+this.name);
	}
	
	public static void main(String[] args) {
		ThisReferenceTest2 test=new ThisReferenceTest2();
		test.display();
	}

}

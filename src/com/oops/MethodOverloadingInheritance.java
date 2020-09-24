package com.oops;

class Parent1 {

	private int i;

	public Parent1(int i) {
		super();
		this.i = i;
	}

	public void display() {
		System.out.println("Value of i is: " + i);
	}
}

public class MethodOverloadingInheritance extends Parent1 {
	private int j;

	public MethodOverloadingInheritance(int i, int j) {
		super(i);
		this.j = j;
	}

	public void display(String message) {
		System.out.println(message+" value of j is: " +j);
	}

	public static void main(String[] args) {
		MethodOverloadingInheritance overloading = new MethodOverloadingInheritance(10, 20);
		overloading.display();
		overloading.display("Child Implementation");
	}

}

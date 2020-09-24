package com.oops;

public class MethodOverriding {

	public static void main(String[] args) {
		Parent parent=new Parent(10);
		Child child=new Child(10, 20);
		parent.display();
		parent=child;
		parent.display();
	}
}

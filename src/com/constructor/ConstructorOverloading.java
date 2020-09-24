package com.constructor;

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		//Oveloaded constructors
		Student student1 = new Student();
		System.out.println(student1);
		
		Student student2 = new Student(1,"Vivek Garg");
		System.out.println(student2);
		
		Student student3 = new Student(1,"Vivek Garg",50l);
		System.out.println(student3);
	}
}

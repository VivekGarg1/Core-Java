package com.constructor;

public class Student {

	private Integer rollNo;
	private String name;
	private Long marks;
	
	//Initializer block
	{
		System.out.println("This will be invoked for all constructors");
	}
	
	public Student() {
	}

	public Student(Integer rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Student(Integer rollNo, String name, Long marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
}

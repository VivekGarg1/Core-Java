package com.home.superthis;

public class ThisOverloadedConstructorTest {

	private int id;
	private String name;

	public ThisOverloadedConstructorTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ThisOverloadedConstructorTest(int id) {
		this(id, null);
	}

	public ThisOverloadedConstructorTest() {
		this(0);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ThisOverloadedConstructorTest [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		ThisOverloadedConstructorTest test = new ThisOverloadedConstructorTest();
		System.out.println(test);
		
		ThisOverloadedConstructorTest test1 = new ThisOverloadedConstructorTest(10);
		System.out.println(test1);
		
		ThisOverloadedConstructorTest test2 = new ThisOverloadedConstructorTest(10,"Vivek Garg");
		System.out.println(test2);
	}

}

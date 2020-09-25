package com.exception;

public class ExceptionMethodOverriding {

	public static void main(String[] args) throws Exception {
		Animal a=new Cat();
		a.eat();
		a.sleep();
	}

}

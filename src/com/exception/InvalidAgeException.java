package com.exception;

public class InvalidAgeException extends RuntimeException{

	private static final long serialVersionUID = 4851801750178603340L;
	
	private int age;
	
	public InvalidAgeException() {
		super();
	}

	public InvalidAgeException(int age) {
		this.age = age;
	}
	
	public InvalidAgeException(int age,String message) {
		super(message);
		this.age = age;
	}
	
	public InvalidAgeException(int age,Throwable throwable, String message) {
		super(message,throwable);
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "InvalidAgeException for age: "+age;
	}
	
	@Override
	public String getMessage() {
		return "InvalidAgeException for age: "+age;
	}
	
	public int getAge() {
		return age;
	}

}

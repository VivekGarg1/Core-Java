package com.exception;

public class Cat extends Animal{

	@Override
	public void eat() throws NullPointerException{
		System.out.println("Cat is eating..");
	}
	
	@Override
	public void sleep() throws Exception {
		System.out.println("Cat is sleeping..");
	}
}

package com.exception;

import java.io.FileNotFoundException;

public class CheckedExceptionPropagation {

	public static void main(String[] args) {
		CheckedExceptionPropagation exceptionPropagation = new CheckedExceptionPropagation();
		exceptionPropagation.method1();
		System.out.println("After handling exception..");
	}

	private void method1() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	private void method2() throws FileNotFoundException {
		System.out.println("In method2..");
		method3();
	}

	private void method3() throws FileNotFoundException {
		System.out.println("In method3..");
		throw new FileNotFoundException("File not found..");
	}

}

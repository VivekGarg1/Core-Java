package com.exception;

public class UnCheckedExceptionPropagation {

	public static void main(String[] args) {
		UnCheckedExceptionPropagation unCheckedExceptionPropagation = new UnCheckedExceptionPropagation();
		unCheckedExceptionPropagation.method1();
		System.out.println("After handling exception..");
	}

	private void method1() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	private void method2() {
		System.out.println("In method2..");
		method3();
	}

	private void method3() {
		System.out.println("In method3..");
		int a = 10 / 0;
		System.out.println(a);
	}

}

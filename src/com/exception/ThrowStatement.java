package com.exception;

public class ThrowStatement {

	public static void main(String[] args) {
		ThrowStatement throwStatement = new ThrowStatement();
		try {
			throwStatement.display();
		} catch (RuntimeException e) {
			System.out.println("Exception caught in catch block of main..");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private void display() {
		try {
			throw new RuntimeException("Runtime exception oocoured..");
		} catch (RuntimeException e) {
			System.out.println("Exception caught in catch block of display..");
			throw e;
		}

	}

}

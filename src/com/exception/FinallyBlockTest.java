package com.exception;

public class FinallyBlockTest {

	public static void main(String[] args) {
		int i=getValue();
		System.out.println(i);
	}

	@SuppressWarnings("finally")
	private static int getValue() {
		try {
			System.out.println("In try block..");
			return 10;
		} finally {
			System.out.println("In finally block..");
			return 20;//this will override try return value so not recomment to return any value from finally block just use to close resource
		}
	}

}

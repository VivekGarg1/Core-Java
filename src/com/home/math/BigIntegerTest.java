package com.home.math;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		int num = 25;
		BigInteger factorial = factorial(num);
		System.out.println("Factorial of " + num + " is: " + factorial);
	}

	private static BigInteger factorial(int num) {
		BigInteger fact = BigInteger.ONE;
		for (int i = 2; i <= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

}

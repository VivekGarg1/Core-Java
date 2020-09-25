package com.exception;

import java.util.Scanner;

public class CustomExceptionTest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter person age:");
			int age = scanner.nextInt();
			new CustomExceptionTest().calculateExtraBenifits(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();//toString overriden method
		}
	}

	private void calculateExtraBenifits(int age) {
		if (age < 60) {
			throw new InvalidAgeException(age);
		} else {
			System.out.println("Recognized as a senior citizen..");
			System.out.println("Calculate extra benifit for senior citizen..");
		}
	}

}

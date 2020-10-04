package com.string;

import java.util.Scanner;

public class StringPalindromeTest {

	public static void main(String[] args) {
			try (Scanner scanner = new Scanner(System.in)) {
				while(true) {
				System.out.println("Enter String which you want to check whether Palindrome or not::");
				String inputText = scanner.next();
				String result = isPalindrimeStringLogic(inputText);
				System.out.println(result);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	private static String isPalindrimeStringLogic(String inputText) {
		if (inputText == null || inputText.trim().isEmpty()) {
			System.out.println("Please enter valid String..");
		}
		String result = "";
		String outputText = reverseStringLogic(inputText);
		if (outputText.equals(inputText))
			result="String is palindrome...";
		else
			result="String is not palindrome...";
		return result;
	}

	private static String reverseStringLogic(String inputText) {
		String result = "";
		for (int i = inputText.length() - 1; i >= 0; i--) {
			char c = inputText.charAt(i);
			result = result + c;
		}
		return result;
	}

}

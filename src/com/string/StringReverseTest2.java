package com.string;

import java.util.Scanner;

public class StringReverseTest2 {

	public static void main(String[] args) {
		try(Scanner scanner=new Scanner(System.in)) {
			System.out.println("Enter String which you want to reverse:");
			String inputText = scanner.next();
			String result = reverseStringLogic(inputText);
			System.out.println("Reverse String: "+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String reverseStringLogic(String inputText) {
		if (inputText == null || inputText.trim().isEmpty()) {
			return inputText;
		}
		return reverseStringLogic(inputText.substring(1))+inputText.charAt(0);
	}
}

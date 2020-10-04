package com.string;

import java.util.Scanner;

public class StringReverseTest1 {

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
		String result="";
		for (int i = inputText.length()-1; i >=0; i--) {
			char c=inputText.charAt(i);
			result=result+c;
		}
		return result;
	}

}

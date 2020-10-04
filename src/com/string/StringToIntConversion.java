package com.string;

import java.util.Scanner;

public class StringToIntConversion {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while(true) {
			System.out.println("Enter String which you want to convetr into int :");
			String inputText = scanner.next();
			System.out.println("String before conversion into int: "+inputText);
			int result =convertStringToInt(inputText);
			System.out.println("String after conversion into int: "+result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int convertStringToInt(String inputText) {
		if (inputText == null || inputText.trim().isEmpty()) {
			System.out.println("Please enter valid String...");
			return 0;
		}
		int i=0;
		int number=0;
		boolean isNegative=false;
		if(inputText.charAt(0)=='-') {
			isNegative=true;
			i=1;
		}
		while (i< inputText.length()) {
			number=number*10;
			number+=(inputText.charAt(i++)-'0');
		}
		if(isNegative)
			number=-number;
		return number;
	}
}

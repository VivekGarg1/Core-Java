package com.number;

import java.util.Scanner;

public class ArmstrongNumberTest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter no which you want to check wherther it is Armstrong or not:");
				int input = scanner.nextInt();
				boolean isArmstrong = isArmstrong(input);
				if (isArmstrong)
					System.out.println("This is an Armstring number...");
				else
					System.out.println("This is not an Armstring number...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean isArmstrong(int input) {
		String inputText = String.valueOf(input);
		int length = inputText.length();
		int inputCopy = input;
		int result = 0;
		for (int i = 0; i < length; i++) {
			int remainder = inputCopy % 10;
			result += Math.pow(remainder, length);
			inputCopy=inputCopy/10;
		}
		if (result == input)
			return true;
		return false;
	}

}

package com.number;

import java.util.Scanner;

public class RevereseNumberTest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter number which you want to reverse:");
				int input = scanner.nextInt();
				int result = getReverse(input);
				System.out.println("Reverse of given number is: "+result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int getReverse(int number) {
		int result=0;
		while(number !=0) {
			int mod=number % 10;
			result=(result*10)+mod;
			number=number / 10;
		}
		return result;
	}

}

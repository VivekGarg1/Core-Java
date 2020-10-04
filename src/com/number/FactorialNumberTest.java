package com.number;

import java.util.Scanner;

public class FactorialNumberTest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter number which you want to get factorial:");
				int input = scanner.nextInt();
				int result = getFactorial(input);
				System.out.println("Factorial of givn number is: "+result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*private static int getFactorial(int number) {
		if(number<0)
			throw new RuntimeException("Factorial of negative no. doesn't exist,try with positive no.");
		int fact=1;
		for (int i = 1; i <= number; i++) {
			fact=fact*i;
		}
		return fact;
	}*/
	
	//Recursive approach
	private static int getFactorial(int n) {
		if(n<0)
			throw new RuntimeException("Factorial of negative no. doesn't exist,try with positive no.");
		if(n>0)
			return getFactorial(n-1)*n;
		else
			return 1;
		 }

}

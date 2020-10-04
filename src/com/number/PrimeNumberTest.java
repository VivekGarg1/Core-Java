package com.number;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter no which you want to check wherther it is prime or not:");
				int input = scanner.nextInt();
				boolean isPrime = isPrime(input);
				if (isPrime)
					System.out.println("This is a Prime number...");
				else
					System.out.println("This is not a Prime number...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean isPrime(int number) {
		if(number<1)
			return false;
		for(int i=2;i<=number/2;i++) {
			if(number % i == 0)
				return false;
		}
		return true;		
	}

}

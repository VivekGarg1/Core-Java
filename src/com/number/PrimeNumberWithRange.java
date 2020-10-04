package com.number;

import java.util.Scanner;

public class PrimeNumberWithRange {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter numbers range in which you want to get prime numbers:");
				int number = scanner.nextInt();
				if(number<1)
					System.out.println("Please enter valid number...");
				for (int i = 2; i <=number; i++) {
					if(isPrime(i))
						System.out.println("Prime numbers are: " +i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean isPrime(int number) {
		for(int i=2;i<=number/2;i++) {
			if(number % i == 0)
				return false;
		}
		return true;		
	}

}

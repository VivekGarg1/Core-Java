package com.number;

import java.util.Scanner;

public class PowerOfNumberTest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter base number:");
				int base = scanner.nextInt();
				System.out.println("Enter exponent number:");
				int exponent = scanner.nextInt();
				long result=1;
				for (; exponent !=0; exponent--) {
					result*=base;
				}
				System.out.println("Result is: "+result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

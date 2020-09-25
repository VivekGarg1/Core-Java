package com.exception;

import java.util.Scanner;

public class BasicExcepionTest {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			while (true) {
				System.out.println("Main method start..");
				scanner = new Scanner(System.in);

				System.out.println("Enter dividend number:");
				int dividend = scanner.nextInt();

				System.out.println("Enter divisor number:");
				int divisor = scanner.nextInt();

				int result = dividend / divisor;
				System.out.println("Result is: " + result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		System.out.println("End main..");
	}

}

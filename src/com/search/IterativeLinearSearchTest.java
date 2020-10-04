package com.search;

import java.util.Scanner;

public class IterativeLinearSearchTest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter input Array size:");
				int inputArraySize = scanner.nextInt();
				int inputArr[]=new int[inputArraySize];
				System.out.println("Enter "+inputArraySize+" array elements:");
				for (int i = 0; i < inputArraySize; i++) {
					inputArr[i]= scanner.nextInt();
				}
				System.out.println("Enter search key element:");
				int searchKey = scanner.nextInt();
				int index = linearSearch(inputArr,searchKey);
				if(index != -1)
					System.out.println("Element "+searchKey+" is present on "+(index+1)+" position");
				else
					System.out.println("Element not found..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int  linearSearch(int[] inputArr, int searchKey) {
		for (int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] == searchKey)
				return i;
		}
		return -1;		
	}

}

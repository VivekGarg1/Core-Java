package com.array;

import java.util.Scanner;

public class FindMaxAndMinElementInMatrix {

	public static void main(String[] args) {
		int numberOfRows;
		int numberOfColumns;
		int[][] inputMatrixArray = null;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter no. of rows in matrix:");
			numberOfRows = scanner.nextInt();
			System.out.println("Enter no. of columns in matrix:");
			numberOfColumns = scanner.nextInt();
			inputMatrixArray = new int[numberOfRows][numberOfColumns];
			System.out.println("Enter matrix element:");
			for (int i = 0; i < numberOfRows; i++) {
				System.out.println("Enter number for row- :" + (i + 1));
				for (int j = 0; j < numberOfColumns; j++) {
					inputMatrixArray[i][j] = scanner.nextInt();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// display matrix
		System.out.println("Matrix you have entered:");
		for (int i = 0; i < inputMatrixArray.length; i++) {
			System.out.println();
			for (int j = 0; j < inputMatrixArray[i].length; j++) {
				System.out.print(inputMatrixArray[i][j] + " ");
			}
		}
		System.out.println();
		findMaxAndMinElementInMatrix(inputMatrixArray);
	}

	private static void findMaxAndMinElementInMatrix(int[][] inputMatrixArray) {
		int maxElement = inputMatrixArray[0][0];
		int minElement = inputMatrixArray[0][0];
		for (int i = 0; i < inputMatrixArray.length; i++) {
			for (int j = 0; j < inputMatrixArray.length; j++) {
				if (maxElement < inputMatrixArray[i][j])
					maxElement = inputMatrixArray[i][j];
				else if (minElement > inputMatrixArray[i][j])
					minElement = inputMatrixArray[i][j];
			}

		}
		System.out.println("Max element is: " + maxElement);
		System.out.println("Min element is: " + minElement);
	}

}

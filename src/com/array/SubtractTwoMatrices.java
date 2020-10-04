package com.array;

import java.util.Scanner;

public class SubtractTwoMatrices {

	public static void main(String[] args) {
		int numberOfRows;
		int numberOfColumns;
		int[][] inputMatrixArray1 = null;
		int[][] inputMatrixArray2 = null;
		int[][] resultMatrix = null;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter no. of rows in matrix:");
			numberOfRows = scanner.nextInt();
			System.out.println("Enter no. of columns in matrix:");
			numberOfColumns = scanner.nextInt();
			inputMatrixArray1 = new int[numberOfRows][numberOfColumns];
			inputMatrixArray2 = new int[numberOfRows][numberOfColumns];
			resultMatrix = new int[numberOfRows][numberOfColumns];
			System.out.println("Enter first matrix element:");
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfColumns; j++) {
					inputMatrixArray1[i][j] = scanner.nextInt();
				}
			}
			System.out.println("First Matrix you have entered:");
			for (int i = 0; i < inputMatrixArray1.length; i++) {
				System.out.println();
				for (int j = 0; j < inputMatrixArray1[i].length; j++) {
					System.out.print(inputMatrixArray1[i][j] + " ");
				}
			}
			
			System.out.println("Enter second matrix element:");
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfColumns; j++) {
					inputMatrixArray2[i][j] = scanner.nextInt();
				}
			}
			System.out.println("Second Matrix you have entered:");
			for (int i = 0; i < inputMatrixArray2.length; i++) {
				System.out.println();
				for (int j = 0; j < inputMatrixArray2[i].length; j++) {
					System.out.print(inputMatrixArray2[i][j] + " ");
				}
			}
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfColumns; j++) {
					resultMatrix[i][j] = inputMatrixArray1[i][j]-inputMatrixArray2[i][j];
				}
			}
			System.out.println("Result matrix is: ");
			for (int i = 0; i < resultMatrix.length; i++) {
				for (int j = 0; j < numberOfColumns; j++) {
					System.out.print(" "+resultMatrix[i][j]+"\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

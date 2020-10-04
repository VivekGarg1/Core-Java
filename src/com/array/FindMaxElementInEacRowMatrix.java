package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElementInEacRowMatrix {

	public static void main(String[] args) {
		int numberOfRows;
		int numberOfColumns;
		int[][] inputMatrixArray=null;
		try(Scanner scanner=new Scanner(System.in)){
			System.out.println("Enter no. of rows in matrix:");
			numberOfRows=scanner.nextInt();
			System.out.println("Enter no. of columns in matrix:");
			numberOfColumns=scanner.nextInt();
			inputMatrixArray=new int[numberOfRows][numberOfColumns];
			System.out.println("Enter matrix element:");
			for(int i=0; i<numberOfRows; i++) {
				System.out.println("Enter number for row- :"+(i+1));
				for(int j=0; j<numberOfColumns; j++) {
					inputMatrixArray[i][j]=scanner.nextInt();
				}				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//display matrix
		System.out.println("Matrix you have entered:");
		for(int i=0; i<inputMatrixArray.length; i++) {
			System.out.println();
			for(int j=0; j<inputMatrixArray[i].length; j++) {
				System.out.print(inputMatrixArray[i][j]+" ");
			}				
		}
		System.out.println();
		findMaxElementInEachRowInMatrix(inputMatrixArray);
	}

	private static void findMaxElementInEachRowInMatrix(int[][] inputMatrixArray) {
		int[] arrayToStoreMaxElementInEachRow=new int[inputMatrixArray.length];
		for(int i=0; i<inputMatrixArray.length; i++) {
			//Initially assign first element of the row as max element for first iteration 
			int maxNumber=inputMatrixArray[i][0];
			for(int j=0; j<inputMatrixArray[i].length; j++) {
				if(maxNumber < inputMatrixArray[i][j])
					maxNumber=inputMatrixArray[i][j];
			}
			arrayToStoreMaxElementInEachRow[i]=maxNumber;
		}
		System.out.println(Arrays.toString(arrayToStoreMaxElementInEachRow));
	}

}

package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class IterativeBubbleSortTest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
		while (true) {
			System.out.println("Enter input Array size:");
			int inputArraySize = scanner.nextInt();
			int inputArr[] = new int[inputArraySize];
			System.out.println("Enter " + inputArraySize + " array elements:");
			for (int i = 0; i < inputArraySize; i++) {
				inputArr[i] = scanner.nextInt();
			}
			System.out.println("Original Array: "+Arrays.toString(inputArr));
			
			int[] sortedArray=bubbleSort(inputArr);
			System.out.println("Sorted Array: "+Arrays.toString(sortedArray));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	private static int[] bubbleSort(int[] inputArr) {
		boolean isSorted=false;
		for (int i = 0; i < inputArr.length-1; i++) {
			for (int j = 0; j < inputArr.length-1-i; j++) {
				if(inputArr[j]>inputArr[j+1]) {
					int temp=inputArr[j];
					inputArr[j]=inputArr[j+1];
					inputArr[j+1]=temp;
					isSorted=true;
				}
				if(!isSorted)
					break;
			}
		}
		return inputArr;
	}

}

package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortTest {

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
			
			int[] sortedArray=selectioSort(inputArr);
			System.out.println("Sorted Array: "+Arrays.toString(sortedArray));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	private static int[] selectioSort(int[] inputArr) {
		for (int i = 0; i < inputArr.length-1; i++) {
			int smallestIndex=i;
			for (int j = i+1; j < inputArr.length; j++) {
				if(inputArr[j]<inputArr[smallestIndex]) {
					smallestIndex=j;
				}
			}
				int temp=inputArr[smallestIndex];
				inputArr[smallestIndex]=inputArr[i];
				inputArr[i]=temp;
		}
		return inputArr;
	}

}

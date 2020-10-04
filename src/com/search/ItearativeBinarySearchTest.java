package com.search;

import java.util.Arrays;
import java.util.Scanner;

public class ItearativeBinarySearchTest {

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
				Arrays.sort(inputArr);
				int startIndex=0;
				int lastIndex=inputArr.length-1;
				int index = binarySearch(inputArr,searchKey,startIndex,lastIndex);
				if(index != -1)
					System.out.println("Element "+searchKey+" is present on "+(index+1)+" position");
				else
					System.out.println("Element not found..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int  binarySearch(int[] inputArr, int searchKey, int startIndex, int lastIndex) {
		while(startIndex<=lastIndex) {
			int middleIndex= (startIndex+lastIndex)/2;
			if(inputArr[middleIndex]==searchKey)
				return middleIndex;
			else if(searchKey < inputArr[middleIndex])
				lastIndex=middleIndex-1;
			else
				startIndex=middleIndex+1;
		}
		return -1;		
	}

}

package com.array;

public class FindFirstAndSecondLargestNumber {

	public static void main(String[] args) {
		int[] inputArray1 = { 23, 45, 89, 12, 36, 100, 83 };
        int firstLargestNum=0;
        int secondLargestNum=0;
        for (int i = 0; i < inputArray1.length; i++) {
			if(firstLargestNum < inputArray1[i]) {
				secondLargestNum=firstLargestNum;
				firstLargestNum=inputArray1[i];
			}
			else if(secondLargestNum < inputArray1[i]) {
				secondLargestNum=inputArray1[i];
			}
		}
        System.out.println("First largest number: "+firstLargestNum+" second largest number: "+secondLargestNum);
	}

}

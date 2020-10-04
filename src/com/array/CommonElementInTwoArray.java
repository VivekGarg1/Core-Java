package com.array;

public class CommonElementInTwoArray {

	public static void main(String[] args) {
		int[] inputArray1 = { 23, 45, 89, 12, 36, 100, 83 };
		int[] inputArray2 = { 11, 26, 45, 83, 23, 74, 480 };
		
		for (int i = 0; i < inputArray1.length; i++) {
			for (int j = 0; j < inputArray2.length; j++) {
				if(inputArray2[j] == inputArray1[i]) {
					System.out.println(inputArray1[i]);
					break;
				}					
			}
		}
	}

}

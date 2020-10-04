package com.array;

import java.util.Arrays;

public class RemoveDuplicateElementsTest {

	public static void main(String[] args) {
		int[] inputArray1 = { 23, 45, 89, 23, 83, 12, 36, 100, 83 };
		System.out.println("Original elemenys: "+Arrays.toString(inputArray1));
		int[] distinctElement = Arrays.stream(inputArray1).distinct().toArray();
		System.out.println("After duplicate removal: "+Arrays.toString(distinctElement));
	}

}

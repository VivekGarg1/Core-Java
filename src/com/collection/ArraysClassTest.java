package com.collection;

import static java.util.Arrays.*;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysClassTest {

	public static void main(String[] args) {
		List<Integer> asList = asList(10,20,30,40,50);
		System.out.println(asList);
		
		int arr[]= {3,8,4,6,5,9};
		sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		
		int binarySearch = binarySearch(arr, 6);
		System.out.println("Index of 6 is: "+binarySearch);
		
		IntStream stream = stream(arr);
		stream.forEach(System.out::println);
	}

}

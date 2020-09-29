package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> intList1 = new ArrayList<>();
		intList1.add(100);
		intList1.add(200);
		intList1.add(300);
		intList1.add(400);
		System.out.println(intList1);

		System.out.println("-----------");
		List<Integer> intList2 = new ArrayList<>(8);
		intList2.add(10);
		intList2.add(20);
		intList2.add(30);
		intList2.add(400);
		System.out.println(intList2);

		System.out.println("-----------");
		List<Integer> intList3 = new ArrayList<>(intList1);
		intList3.add(1000);
		intList3.add(2000);
		System.out.println(intList3);
	}

}

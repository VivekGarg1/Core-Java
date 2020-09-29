package com.collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> intList1 = new LinkedList<>();
		intList1.add(300);
		intList1.add(400);
		intList1.add(500);
		intList1.add(600);
		System.out.println(intList1);
		intList1.addFirst(100);
		intList1.addLast(700);
		intList1.add(1, 200);
		System.out.println(intList1);
	}

}

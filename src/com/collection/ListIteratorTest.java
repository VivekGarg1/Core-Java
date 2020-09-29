package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		iterateListUsingListIterator(list);
		addElementInListUsingListIterator(list);
		deleteElementInListUsingListIterator(list);

	}

	private static void deleteElementInListUsingListIterator(List<Integer> list) {
		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Integer n = (Integer) listIterator.next();
			if(n==5)
				listIterator.remove();
		}
		System.out.println(list);
	}

	private static void addElementInListUsingListIterator(List<Integer> list) {
		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Integer n = (Integer) listIterator.next();
			if(n==5)
				listIterator.add(6);
		}
		System.out.println(list);
	}

	private static void iterateListUsingListIterator(List<Integer> list) {
		ListIterator<Integer> listIterator = list.listIterator();
		System.out.println("Forward direction...");
		while (listIterator.hasNext()) {
			Integer n = (Integer) listIterator.next();
			System.out.println(n);
		}
		System.out.println("Backward direction...");
		while (listIterator.hasPrevious()) {
			Integer n = (Integer) listIterator.previous();
			System.out.println(n);
		}
	}
}

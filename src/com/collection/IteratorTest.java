package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<Integer> intList1 = new ArrayList<>();
		intList1.add(1);
		intList1.add(2);
		intList1.add(3);
		intList1.add(4);
		intList1.add(5);

		Iterator<Integer> itr = intList1.iterator();
		while (itr.hasNext()) {
			Integer n = (Integer) itr.next();
			System.out.println(n);
			if (n == 5)
				itr.remove();
		}
		System.out.println(intList1);

	}
}

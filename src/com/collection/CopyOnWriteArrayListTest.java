package com.collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

	public static void main(String[] args) {
		List<Integer> intList1 = new CopyOnWriteArrayList<>();
		intList1.add(100);
		intList1.add(200);
		intList1.add(300);
		intList1.add(400);
		
		Iterator<Integer> itr=intList1.iterator();
		while (itr.hasNext()) {
			Integer n = (Integer) itr.next();
			System.out.println(n);
			if(n == 400)
				intList1.add(500);
		}
		System.out.println(intList1);
	}

}

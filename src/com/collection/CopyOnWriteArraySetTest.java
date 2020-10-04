package com.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetTest {

	public static void main(String[] args) {
		Set<Integer> list = new CopyOnWriteArraySet<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		Iterator<Integer> itr=list.iterator();
		while (itr.hasNext()) {
			Integer n = (Integer) itr.next();
			System.out.println(n);
			if(n == 400)
				list.add(500);
		}
		System.out.println(list);
	}

}

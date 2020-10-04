package com.collection;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class IdentityHashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> hm = new WeakHashMap<>();
		Map<String, Integer> ihm = new IdentityHashMap<>();

		hm.put("A", 11);
		hm.put(new String("A"), 12);

		ihm.put("B", 13);
		ihm.put(new String("B"), 14);

		System.out.println("Size of HashMap: "+hm.size());
		System.out.println("Size of IdentityHashMap: "+ihm.size());
	}

}

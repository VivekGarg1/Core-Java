package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		Enumeration<Integer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			Integer n = (Integer) enumeration.nextElement();
			System.out.println(n);
			//vector.add(6);going in ininite loop
		}
		System.out.println(vector);
	}

}

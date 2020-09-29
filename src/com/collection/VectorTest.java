package com.collection;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> intVector=new Vector<Integer>();
		intVector.add(100);
		intVector.add(200);
		intVector.add(300);
		intVector.add(400);
		intVector.add(500);
		intVector.add(600);
		intVector.add(700);
		intVector.add(800);
		intVector.add(900);
		intVector.add(1000);
		System.out.println(intVector.capacity());
		intVector.add(1100);
		System.out.println(intVector.capacity());
	}

}

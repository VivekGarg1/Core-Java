package com.string;

public class StringContainsTest {

	public static void main(String[] args) {
		String s1="Contains example";
		String s2="example";
		String s3="Example";
		
		System.out.println("s1 contains s2: "+s1.contains(s2));
		System.out.println("s1 contains s3: "+s1.contains(s3));
		System.out.println("s1 contains s3: "+s1.contains(s3.toLowerCase()));
	}

}

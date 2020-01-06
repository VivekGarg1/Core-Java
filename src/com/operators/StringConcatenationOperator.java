package com.operators;

public class StringConcatenationOperator {

	public static void main(String[] args) {
		
		System.out.println("String Concatenation Results:");
		String s="vivek";
		int a1=10,a2=20,a3=30;
		System.out.println(s+a1+a2+a3);
		System.out.println(a1+a2+a3+s);
		System.out.println(a1+a2+s+a3);
		System.out.println(a3+s+a1+a2);

	}

}

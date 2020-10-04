package com.string;

public class StringSubstringTest {

	public static void main(String[] args) {
		String s="Example String";
		
		System.out.println("value- "+s.substring(0,7));
		System.out.println("value- "+s.substring(8));
		System.out.println("value- "+s.substring(14));//it returns nothing 
		System.out.println("value- "+s.substring(15));//its greater than length so return java.lang.StringIndexOutOfBoundsException: String index out of range: -1
	}

}

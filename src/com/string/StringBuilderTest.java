package com.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuilder sb1=new StringBuilder("Vivek Garg");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuilder sb2 = sb1.append(" this").append(" is").append(" your").append(" phone");
		
		if(sb1 == sb2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String str1=new String();
		String str2=str1.concat("Vivek");
		if(str1 == str2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		StringBuilder sb3=new StringBuilder("Vivk");
		sb3.insert(3, 'e');
		System.out.println(sb3);
		
		System.out.println(sb3.reverse());
	}

}

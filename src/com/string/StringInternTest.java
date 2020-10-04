package com.string;

public class StringInternTest {

	public static void main(String[] args) {
		//Created in String constant pool
		String str1="Vivek Garg";
		String str2="Vivek Garg";
		if (str1 == str2) {
			System.out.println("str1 and str2 are same..");
		} else {
			System.out.println("str1 and str2 are different..");
		}
		
		//Created in heap
		String str3=new String("Vivek Garg");
		String str4=new String("Vivek Garg").intern();
		if (str3 == str4) {
			System.out.println("str3 and str4 are same..");
		} else {
			System.out.println("str3 and str4 are different..");
		}
		
		if (str1 == str4) {
			System.out.println("str1 and str4 are same..");
		} else {
			System.out.println("str1 and str4 are different..");
		}
	}

}

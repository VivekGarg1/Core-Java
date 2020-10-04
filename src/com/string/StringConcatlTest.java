package com.string;

public class StringConcatlTest {

	public static void main(String[] args) {
		//Created in String constant pool
		String str1="Vivek";
		String str2=" Garg";
		
		str1=str1 + str2;
		System.out.println(str1);
	}
}

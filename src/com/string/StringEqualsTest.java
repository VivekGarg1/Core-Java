package com.string;

public class StringEqualsTest {

	public static void main(String[] args) {
		String str1="Vivek Garg";
		String str2=new String("Vivek Garg");
		if (str1.equals(str2)) {
			System.out.println("str1 and str2 are same..");
		} else {
			System.out.println("str1 and str2 are different..");
		}
			
		String str3="Vivek Garg";
		String str4=new String("Vivek Garg");
		if (str3 == str4) {
			System.out.println("str3 and str4 are same..");
		} else {
			System.out.println("str3 and str4 are different..");
		}
		
		String str5="VIVEK GRAG";
		String str6=new String("Vivek Garg");
		if (str5.equals(str6)) {
			System.out.println("str5 and str6 are same..");
		} else {
			System.out.println("str5 and str6 are different..");
		}
		
		String str7="Vivek Garg";
		String str8=new String("Vivek Garg");
		if (str7.equalsIgnoreCase(str8)) {
			System.out.println("str7 and str8 are same..");
		} else {
			System.out.println("str7 and str8 are different..");
		}
		
		String s="This is a test String";
		
		System.out.println("String for comparision is: "+s.substring(0, 4));
		System.out.println(s.substring(0, 4).equals("This"));
		System.out.println(s.substring(0, 4).equals("this"));
		System.out.println(s.substring(0, 4).equalsIgnoreCase("this"));
	}

	}

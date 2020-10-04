package com.string;

public class StringIndexOfTest {

	public static void main(String[] args) {
		String date="05/26/2018";
		
		System.out.println("Index: "+date.indexOf("/"));
		System.out.println("Month: "+date.substring(0, date.indexOf("/")));
		System.out.println("Index: "+date.lastIndexOf("/"));
		System.out.println("Year: "+date.substring(date.lastIndexOf("/")+1));
	}

}

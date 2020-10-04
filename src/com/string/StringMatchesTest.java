package com.string;

public class StringMatchesTest {

	public static void main(String[] args) {
		String s="This is a test String";
		String[] words= {"Java","java8","a123","*pass","test","xy4&ty"};
		
		System.out.println(s.startsWith("This"));
		System.out.println(s.startsWith("test",10));
		System.out.println(s.endsWith("test"));
		System.out.println(s.endsWith("test String"));
		System.out.println(s.endsWith("String"));
		
		for (String word : words) {
			if (word.matches("[a-zA-Z]+")) {
				System.out.println("Matched string- "+word);
			}
		}
	}

}

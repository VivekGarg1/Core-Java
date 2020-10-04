package com.string;

import java.util.Arrays;

public class StringAnagramsTest {

	public static void main(String[] args) {
		isAnagramBySortingLogic("restful","fluster");
		isAnagramBySortingLogic("restful","fluser");
		isAnagramBySortingLogic("forty five","over fifty");
	}

	private static void isAnagramBySortingLogic(String inputText1, String inputText2) {
		String s1=inputText1.toLowerCase().replaceAll("\\s", "");
		String s2=inputText2.toLowerCase().replaceAll("\\s", "");
		s1=sortInputString(s1);
		s2=sortInputString(s2);
		if(s1.equals(s2))
			System.out.println("Strings are anagrams");
		else
			System.out.println("Strings are not anagrams");
	}

	private static String sortInputString(String s1) {
		char[] c=s1.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

}

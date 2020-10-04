package com.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StringNonRepeatChar {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while(true) {
			System.out.println("Enter String which you want to check non repeated character :");
			String inputText = scanner.next();
			Character c =findFirstNonRepeatedCharacterFromString(inputText);
			if(c !=null)
				System.out.println("First non-repeated character is: "+c);
			else
				System.out.println("There is no single non-repeated character found..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*private static Character findFirstNonRepeatedCharacterFromString(String inputText) {
		if (inputText == null || inputText.trim().isEmpty()) {
			System.out.println("Please enter valid String...");
			return null;
		}
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		for (int i = 0; i < inputText.length(); i++) {
			char c = inputText.charAt(i);
			if (c == ' ')
				continue;
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() == 1)
				return entry.getKey();
		}
		return null;
	}*/
	
	//2nd way
	private static Character findFirstNonRepeatedCharacterFromString(String inputText) {
		if (inputText == null || inputText.trim().isEmpty()) {
			System.out.println("Please enter valid String...");
			return null;
		}
		for (int i = 0; i < inputText.length(); i++) {
			char c =inputText.charAt(i);
			if(inputText.indexOf(c) == inputText.lastIndexOf(c))
				return c;
		}
		return null;
	}
}

package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringCharAppearCount {

	public static void main(String[] args) {
		coubtCharacterAppearInString("Hello Vivek Garg you are learning java");
	}

	private static void coubtCharacterAppearInString(String inputText) {
		if (inputText == null || inputText.trim().isEmpty())
			System.out.println("Please enter valid String...");
		Map<Character, Integer> charCountMap = new HashMap<>();
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
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

}

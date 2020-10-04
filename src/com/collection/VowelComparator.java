package com.collection;

import java.util.Comparator;

public class VowelComparator implements Comparator<String>{

	@Override
	public int compare(String x, String y) {
		if(getVowelCount(x) < getVowelCount(y))
			return -1;
		else if(getVowelCount(x) > getVowelCount(y))
			return 1;
		return 0;
	}

	private int getVowelCount(String word) {
		int vowel=0;
		for (int i = 0; i < word.length(); i++) {
			char ch=word.charAt(i);
			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||ch == 'i' || ch == 'I'|| ch == 'o' 
					|| ch == 'O' || ch == 'u' || ch == 'U')
				vowel++;
			}
		return vowel;
	}

}

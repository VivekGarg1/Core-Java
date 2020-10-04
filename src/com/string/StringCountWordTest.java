package com.string;

public class StringCountWordTest {

	public static void main(String[] args) {
		String inputText = "Welcome you in String learning hello vivek";
		/*
		 * int result1=wordsCountUsingRegExp(inputText);
		 * System.out.println("Words count is: "+result1);
		 */

		int result2 = wordsCountUsingCustomLogic(inputText);
		System.out.println("Words count is: " + result2);
	}

	private static int wordsCountUsingCustomLogic(String inputText) {
		if (inputText == null || inputText.trim().isEmpty())
			return 0;
		int count = 0;
		for (int index = 0; index <= inputText.length(); index++) {
			int indexOf = inputText.indexOf(" ");
			if (indexOf != -1) {
				String word = inputText.substring(0, indexOf);
				if (word != null) {
					count++;
					inputText = inputText.substring(indexOf + 1);
					index=inputText.length()-1;
				}
			} else {
				count++;
				break;
			}
		}
		return count;
	}

	private static int wordsCountUsingRegExp(String inputText) {
		// TODO Auto-generated method stub
		return 0;
	}

}

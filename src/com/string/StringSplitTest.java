package com.string;

public class StringSplitTest {

	public static void main(String[] args) {
		String s="This is a test String";
		String[] split = s.split("\\s");
		for (String word : split) {
			System.out.println(word);
		}
		
		String date="05/26/2020";
		String[] dateArr = date.split("/");
		System.out.println("Month: "+dateArr[0]+",Date: "+dateArr[1]+" ,Year: "+dateArr[2]);
		
		String inputTextCommaDelimeter="Vivek,Prabhat,Paras,Shubham";
		splitStringCommaDelimeter(inputTextCommaDelimeter);
		
		String inputTextTabDelimeter="Vivek	Prabhat	Paras	Shubham";
		splitStringTabDelimeter(inputTextTabDelimeter);
		
		String inputTextPipeDelimeter="Vivek|Prabhat|Paras|Shubham";
		splitStringPipeDelimeter(inputTextPipeDelimeter);
	}

	private static void splitStringPipeDelimeter(String inputTextPipeDelimeter) {
		System.out.println("Input String splitted based on pipe(|) delimeter:");
		if(inputTextPipeDelimeter == null || inputTextPipeDelimeter.isEmpty())
			return;
		String[] split = inputTextPipeDelimeter.split("\\|");
		for (String s : split) {
			System.out.println(s);
		}
	}

	private static void splitStringTabDelimeter(String inputTextTabDelimeter) {
		System.out.println("Input String splitted based on tab delimeter:");
		if(inputTextTabDelimeter == null || inputTextTabDelimeter.isEmpty())
			return;
		String[] split = inputTextTabDelimeter.split("\t");
		for (String s : split) {
			System.out.println(s);
		}
	}

	private static void splitStringCommaDelimeter(String inputTextCommaDelimeter) {
		System.out.println("Input String splitted based on comma(,) delimeter:");
		if(inputTextCommaDelimeter == null || inputTextCommaDelimeter.isEmpty())
			return;
		String[] split = inputTextCommaDelimeter.split(",");
		for (String s : split) {
			System.out.println(s);
		}
	}

}

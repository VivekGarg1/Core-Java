package com.exception;

import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) {
		try {
			displayFileContent();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void displayFileContent() throws IOException {
		System.out.println("In display file content..");
		throw new IOException("File I/O exception has occured..");
	}

}

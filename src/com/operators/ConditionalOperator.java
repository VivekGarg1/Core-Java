package com.operators;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		
		int x=(10<20)?30:40;
		System.out.println(x);
		
		int y=(10>20)?30:((40>50)?60:70);
		System.out.println(y);
	}

}

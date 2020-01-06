package com.operators;

public class BitwiseOperator {
	
	public static void main(String[] args) {
		
		System.out.println(true & false);
		System.out.println(true | false);
		System.out.println(true ^ false);
		
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		
		//Boolean Complement Operator(!)
		
		//System.out.println(!4);//The operator ! is undefined for the argument type(s) int
		System.out.println(!false);
	}

}

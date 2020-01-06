package com.operators;

public class TypeCastOperator {
	
	public static void main(String[] args) {
		
		//Implicit Type Casting
		
		int x='a';
		System.out.println(x);
		
		double d=10;
		System.out.println(d);
		
		//Explicit Type Casting
		
		int y=130;
		//byte b=y;//Type mismatch: cannot convert from int to byte
		byte b=(byte)(y);
		System.out.println(b);
		
		int x1=150;
		short s=(short)x1;
		System.out.println(s);
		byte b1=(byte)x1;
		System.out.println(b1);
		
		double d1=130.456;
		int i=(int)d1;
		System.out.println(i);
		byte b2=(byte)d1;
		System.out.println(b2);
	}

}

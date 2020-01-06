package com.operators;

public class IncrandDecrOperator {

	public static void main(String[] args) {
		
		int x=10;
		int y=++x;
		System.out.println(y);
		
		int a=10;
		//int b=++10;//Invalid argument to operation ++/--
		
		//int b=++(++a);//Invalid argument to operation ++/--
		
		final int c=10;
		//c++;//The final local variable c cannot be assigned. It must be blank and not using a compound assignment
		
		char ch='a';
		ch++;
		System.out.println(ch);
		
		double d=10.5;
		d++;
		System.out.println(d);
		
		boolean b=false;
		//b++;//Type mismatch: cannot convert from boolean to int
		
		byte b1=10;
		byte b2=10;
		//byte b3=b1+b2;//Type mismatch: cannot convert from int to byte
		byte b3=(byte)(b1+b2);
		System.out.println(b3);
		
		//b1=b1+1;//Type mismatch: cannot convert from int to byte
		b1=(byte)(b1+1);
		System.out.println(b1);
		
		b1++;//Internal type casting performed automatically
		System.out.println(b1);
		}

}

package com.basic;

public class Literals {
	
	public static void main(String[] args) {
		
		//Integral Literals
		//1.Decimal form
		
		int i=10;
		System.out.println(i);
		
		//2.Octal form
		int x=010;
		System.out.println(x);
		//int x1=0768;//The literal 0768 of type int is out of range 
		int x2=0777;
		System.out.println(x2);
		
		//3.HexaDecimal form
		int a=0x10;
		System.out.println(a);
		int a1=0XFace;
		System.out.println(a1);
		
		long l=10l;
		System.out.println(l);
		long l1=10L;
		System.out.println(l1);
		
		//Floating point literals
		//float f=10.0;//Type mismatch: cannot convert from double to float
		float f1=10.0f;
		float f2=5.0F;
		//float f3=89.0D;//Type mismatch: cannot convert from double to float
		double d=12.0D;
		double d1=4.0F;
		double d2=5.0d;
		double d3=0777;
		double d4=0777.0;
		double d5=0xface;
		//double d6=0xface.0;//Invalid hex literal number
		
		//Boolean Literals
		
		boolean b=true;
		//boolean b1=0;//Type mismatch: cannot convert from int to boolean
		
		//Char Literals
		
		char ch='a';
		//char ch1='ab';//Invalid character constant
		char ch2=97;
		System.out.println(ch2);
		char ch3=0XFace;
		System.out.println(ch3);
		char ch4=65535;
		char ch5='\u0061';
		System.out.println(ch5);
		char ch6='\u0062';
		System.out.println(ch6);
		
		//String Literal
		String s="vivek";
		
		//1.7v enhancements
		
		//new form is binary form
		
		int g=0B1111;
		System.out.println(g);
		int g1=0b0011;
		System.out.println(g1);
		
		double t=1_2_34_5.6_7_89;
		System.out.println(t);
	}

}

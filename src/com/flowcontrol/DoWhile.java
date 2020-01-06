package com.flowcontrol;

public class DoWhile {
	
	public static void main(String[] args) {
		
		/*do
			System.out.println("Hello");
		while(true);*/
		
		/*do;
			while(true);*/
		
		/*do while(true)
			System.out.println("Hello");
		while(true);*/
		
		/*do 
			System.out.println("Hello");
		while(true);
		System.out.println("Hi");//Unreachable code*/
		
		do 
			System.out.println("Hello");
		while(false);
		System.out.println("Hi");
		
		int a=10,b=20;
		do 
			System.out.println("Hello");
		while(a>b);
		System.out.println("Hi");
		
		/*do 
			System.out.println("Hello");
		while(a<b);
		System.out.println("Hi");*/
	}

}

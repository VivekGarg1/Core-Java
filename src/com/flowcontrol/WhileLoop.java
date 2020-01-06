package com.flowcontrol;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		/*while(1) {//Type mismatch: cannot convert from int to boolean
			System.out.println("Hello");
		}*/
		
		/*while(true)
			System.out.println("Hello");*/
		
		/*while(true);*/
		
		/*while(true)
			int x=10;//The left-hand side of an assignment must be a variable*/
		
		/*while(true)
		{
			int x=10;
		}*/
		
		/*while(true)
			System.out.println("Hello");
		System.out.println("Hi");//Unreachable code*/
		
		/*while(false)
			System.out.println("Hello");//Unreachable code
		System.out.println("Hi");*/
		
		/*int a=10,b=20;
		while(a<b) {
			System.out.println("Hello");
		}
		System.out.println("Hi");*/
		
		int a1=10,b1=20;
		while(a1>b1) {
			System.out.println("Hello");
		}
		System.out.println("Hi");
		
		/*final int a=10,b=20;
		while(a<b) {
			System.out.println("Hello");
		}
		System.out.println("Hi");//Unreachable code*/
		
		/*final int a1=10,b1=20;
		while(a1>b1) {//Unreachable code
			System.out.println("Hello");
		}
		System.out.println("Hi");*/
		
		
	}
}

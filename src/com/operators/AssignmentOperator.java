package com.operators;

public class AssignmentOperator {
	
	public static void main(String[] args) {
		
		//Simple Assignment
		
		int x=10;
		
		//Chained Assignment
		
		int a,b,c,d;
		a=b=c=d=20;
		System.out.println(a+" "+b+" "+c+" "+d);
		
		//int q=w=e=r=20;//w cannot be resolved to a variable
		
		//Compound Assignment
		
		int a1=10;
		a1+=10;
		System.out.println(a1);
		
		byte b1=10;
		b1+=1;//Internal type casting perform at convert b1=(byte)(b1+1)
		System.out.println(b1);
	}

}

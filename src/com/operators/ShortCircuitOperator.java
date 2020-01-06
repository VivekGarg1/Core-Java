package com.operators;

public class ShortCircuitOperator {
	
	public static void main(String[] args) {
		
		int x=10;
		int y=15;
		if(++x < 10 & ++y >15)
			x++;
		else
			y++;
		System.out.println(x+"  "+y);
		
		if(++x < 10 && ++y >15)
			x++;
		else
			y++;
		System.out.println(x+"  "+y);
		
		if(++x < 10 | ++y >15)
			x++;
		else
			y++;
		System.out.println(x+"  "+y);
		
		if(++x < 10 || ++y >15)
			x++;
		else
			y++;
		System.out.println(x+"  "+y);
		
		int x1=10;
		if(++x1<10 && x/0>10)
		   System.out.println("Hello");
		else
			System.out.println("hi");
	}

}

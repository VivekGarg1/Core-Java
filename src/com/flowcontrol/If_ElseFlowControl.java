package com.flowcontrol;

public class If_ElseFlowControl {
	
	public static void main(String[] args) {
		
		//selection statements
		int x=10;
		//if(x) can not compile type should be boolean
		
		//if(x=20) can not compile type should be boolean
		
		if(x==10)
			System.out.println("Hello");
		else
			System.out.println("Hi");
		
		boolean b=true;
		if(b=false)
			System.out.println("Hello");
		else
			System.out.println("Hi");
		
		if(b==false)
			System.out.println("Hello");
		else
			System.out.println("Hi");
		
		if(true)
			System.out.println("Hello");
		
		if(true);;;;;;;;;
		
		if(true) {
			int y=10;
			System.out.println(y);
		}
		
		/*if(true)
		    int x=10;*///The left-hand side of an assignment must be a variable
	}

}

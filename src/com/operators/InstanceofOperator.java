package com.operators;

public class InstanceofOperator {
	
	public static void main(String[] args) {
		
		Thread t=new Thread();
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Runnable);
		//System.out.println(t instanceof String);//Incompatible conditional operand types Thread and String
		
		System.out.println(null instanceof Object);
		System.out.println(null instanceof Thread);
		System.out.println(null instanceof Runnable);
	}

}

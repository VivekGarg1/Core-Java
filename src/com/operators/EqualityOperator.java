package com.operators;

public class EqualityOperator {
	
	public static void main(String[] args) {
		
		System.out.println(10 == 20);
		System.out.println('a' == 20);
		System.out.println('a' == 97.0);
		System.out.println(false == false);
		
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=t1;
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
		
		String s1=new String();
		String s2=new String();
		String s3=s1;
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		Thread t4=new Thread();
		Object o=new Object();
		String s4=new String();
		System.out.println(t4 == o);
		System.out.println(o == s4);
		//System.out.println(t4 == s4);//Incompatible operand types Thread and String
		
		String s5=new String("Vivek");
		System.out.println(s5 == null);
		
		String s6=null;
		System.out.println(s6 == null);
	}

}

package com.home.math;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		
		System.out.println("---Financial calculation with double and float---");
		double d1=376.56;
		double d2=376.26;
		System.out.println("d1-d2 is: "+(d1-d2));
		
		System.out.println("---Financial calculation with BigDecimal---");
		BigDecimal bd1=new BigDecimal("376.56");
		BigDecimal bd2=new BigDecimal("376.26");
		System.out.println("bd1-bd2 is: "+bd1.subtract(bd2));
		
		System.out.println("---BigDecimal Constructor---");
		BigDecimal bd3=new BigDecimal(376.56);
		System.out.println(bd3.toString());
		
		BigDecimal bd4=new BigDecimal("376.56");
		System.out.println(bd4.toString());
	}

}

package com.declarations;

import static java.lang.System.out;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.*;
//import static java.lang.Integer.*;
import static java.lang.Byte.*;

class Demo{
	
	static String s="Vivek Garg";
}
public class StaticImport {

	public static void main(String[] args) {
		System.out.println(sqrt(4));
		System.out.println(max(10, 12));
		System.out.println(random());
		out.println(min(10, 12));
		System.out.println(Demo.s.length());
		System.out.println(MAX_VALUE);
		
	}
}



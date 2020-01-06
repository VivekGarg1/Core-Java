package com.basic;

public class DataTypes {
	
	public static void main(String[] args) {
		
		//Integral data types
		//byte(-128 to 127)
		byte b=10;
        byte b3='a';
		System.out.println(b3);
		//byte b1=128;//Type mismatch: cannot convert from int to byte
		//byte b2=10.5;//Type mismatch: cannot convert from double to byte
		//byte b4="vivek";//Type mismatch: cannot convert from String to byte
		//byte b5=true;//Type mismatch: cannot convert from boolean to byte
		
		//short 2 byte(-32768 to 32767)
		short s=32767;
		//short s1=32768;//Type mismatch: cannot convert from int to short
		
		//int 4 byte(-2147483648 to 2147483647)
		int x=2147483647;
		//int x1=2147483648;//The literal 2147483648 of type int is out of range 
		
		//long 8 byte
		
		//Floating point data types
		//float(4 byte),double(8 byte)
		
		//boolean
		boolean q=true;
		//boolean q1=0;//Type mismatch: cannot convert from int to boolean
		//boolean q2=True;//True cannot be resolved to a variable
		//boolean q3="vivek";//Type mismatch: cannot convert from String to boolean
		
		/*while(1) {//Type mismatch: cannot convert from int to boolean
			System.out.println("hello");
		}*/
		
		
		//char 2 bytes(0 to 65535)
		//char c=null;//Type mismatch: cannot convert from null to char
		
		
		
		
	}

}

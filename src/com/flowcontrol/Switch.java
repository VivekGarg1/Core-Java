package com.flowcontrol;

public class Switch {
	
	public static void main(String[] args) {
		
		int a=10;
		switch (a) {
		
	}
		
		/*int x1=10;
		switch(x1) {
		{
		     //System.out.println();//Syntax error on token "{", SwitchLabels expected after this token
		}*/
		
		int x=10;
		final int y=20;
		switch (x) {
		case 10:
			System.out.println(10);
			
		/*case y://case expressions must be constant expressions without final
			System.out.println(10);
			break;*/
			
		case y://with final
			System.out.println(20);
        default:
			System.out.println("Vivek");
		}
		
		switch (x+1) {
		case 11:
			System.out.println(10);
			
		case 10+20+30:
			System.out.println(60);
		}
		
		byte b=10;
		switch(b) {
		case 10:
			System.out.println(10);
			
		case 100:
			System.out.println(100);
			
		/*case 1000://Type mismatch: cannot convert from int to byte
			System.out.println(1000);*/
		}
		
		switch(b+1) {
		case 10:
			System.out.println(10);
			
		case 100:
			System.out.println(100);
			
		case 1000:
			System.out.println(1000);
		}
		
		/*int x1=10;
		switch(x1) {
		case 97://Duplicate case
			System.out.println(97);
			
		case 98:
			System.out.println(98);
			
		case 'a'://Duplicate case a means 97
			System.out.println('a');
		}*/
		
	}

}

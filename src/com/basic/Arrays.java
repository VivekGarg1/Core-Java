package com.basic;

public class Arrays {
	
	public static void main(String[] args) {
		
		int[] x ;
		int x1[];
		int []x2;
		
		//int[6] x3;//Syntax error on token "6", delete this token
		
		int[] a=new int[3];
		System.out.println(a.getClass().getName());
		int[][] a1=new int[3][];
		System.out.println(a1.getClass().getName());
		int[] a2=new int[0];
		System.out.println(a2);
		//int[] a3=new int[-2];//RE:java.lang.NegativeArraySizeException
		//double[] d=new double[10l];//Type mismatch: cannot convert from long to int
		
		int[] a4;
		//a4= {1,2,3};//Array constants can only be used in initializers
		int[] a5={1,2,3};
		System.out.println(a5.length);
		
		String[] s={"Vivek","Garg"};
		System.out.println(s.length);
		//System.out.println(s.length());//Cannot invoke length() on the array type String[]
		System.out.println(s[0]);
		System.out.println(s[0].length());
		
		int[][] y=new int[6][3];
		System.out.println(y.length);
		System.out.println(y[1].length);
		
		//Anonymous array
		sum(new int[] {10,20,30});
		
		int[] x4=new int[5];
		byte b=20;
		short s1=30;
		x4[0]=10;
		x4[1]='a';
		x4[2]=b;
		x4[3]=s1;
		x4[4]=10;
		//x4[5]=10;//java.lang.ArrayIndexOutOfBoundsException: 5
		
		Object[] o=new Object[10];
		o[0]=new String("vivek");
		o[1]=new Integer(10);
		System.out.println(o[0]+","+o[1]);
		
		Number[] n=new Number[3];
		n[0]=new Integer(10);
		n[1]=new Double(10.5);
		//n[2]=new String("vivek");//Type mismatch: cannot convert from String to Number
		
		Runnable[] r=new Runnable[2];
		r[0]=new Thread();
		
		int[] q= {1};
		String[] q1= {"vivek"};
		//char[] ch=q;//Type mismatch: cannot convert from int[] to char[]
		Object[] o1=q1;
		
		String[] argh= {"a","b","c"};
		args=argh;
		for(String s4:args) {
			System.out.println(s4);
		}
		}
	
	public static void sum(int[] x) {
		int total=0;
		for(int x1:x) {
			total=total+x1;
		}
		System.out.println("The sum: "+total);
	}

}

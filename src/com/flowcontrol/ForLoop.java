package com.flowcontrol;

public class ForLoop {
	
	public static void main(String[] args) {
		
		int i=0;
		for (System.out.println("Hello");i<3;i++) {
			System.out.println("Hi");
		}
		
		/*for(; ;)
			System.out.println("Hello");*/
		
		int i1=0;
		for(System.out.println("Hello");i1<3;System.out.println("Hi")) {
			i1++;
		}
		
		/*for (int i2=0;true;i2++) {
			System.out.println("Hello");
		}
		System.out.println("Hi");//Unreachable code*/
		
		int[] x= {10,20,30,40};
		for(int a=0;a<x.length;a++) {
			System.out.println(x[a]);
		}
		
		//For Each loop
		for(int x1:x) {
			System.out.println(x1);
		}
		
		int[][] x1= {{10,20,30,40},{50,60,70}};
		for(int [] x2:x1) {
			for(int x3:x2) {
				System.out.println(x3);
			}
		}
		
		int[] x2= {10,20,30,40};
		for(int b=x2.length-1;b>=0;b--) {
			System.out.println(x2[b]);
		}
		
		for (int j = 0;j<10;j++) {
			if(j==5)
				break;
			System.out.println(j);
		}
		

		for (int j = 0;j<10;j++) {
			if(j==5)
				continue;
			System.out.println(j);
		}
		
		int c=10;
		l1:{
			System.out.println("begin");
			if(c==10)
			break l1;
			System.out.println("end");
		}
		System.out.println("Hello");
	}

}

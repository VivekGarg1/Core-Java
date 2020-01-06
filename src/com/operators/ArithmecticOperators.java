package com.operators;

public class ArithmecticOperators {

	public static void main(String[] args) {
		
		//MAX(int,type of a,type of b);
		
				System.out.println("Arithmetic Operators Results:");
				System.out.println('a'+'b');
				System.out.println('a'+0.89);
				
				//INFINITY Concept
				
				try {
				System.out.println(10/0);//RE:java.lang.ArithmeticException: / by zero
				}
				catch(Exception e){
					//e.printStackTrace();
				}
				System.out.println(10/0.0);//Print INFINTY cause of javap.land.Double
				System.out.println(-10/0.0);//Print -INFINTY
				
				//Undefined Concept
				
				try {
					System.out.println(0/0);//RE:java.lang.ArithmeticException: / by zero
					}
					catch(Exception e){
						//e.printStackTrace();
					}
				System.out.println(0/0.0);//Print NaN
				System.out.println(-0/0.0);//Print NaN
				
				System.out.println(10 < Float.NaN);
				System.out.println(10 > Float.NaN);
				System.out.println(10 <= Float.NaN);
				System.out.println(10 >= Float.NaN);
				System.out.println(10 == Float.NaN);
				System.out.println(10 != Float.NaN);
				System.out.println(Float.NaN == Float.NaN);
				System.out.println(Float.NaN != Float.NaN);
}

}

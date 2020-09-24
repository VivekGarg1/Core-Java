package com.oops;

public class MethodOverloading {

	void overLoadedMethod(int i) {
		System.out.println("Overloaded method with 1 int parameter: "+i);
	}
	
	/*void overLoadedMethod(int i,int j) {
		System.out.println("Overloaded method with 2 int parameter: "+i+","+j);
	}*/
	
	void overLoadedMethod(double i) {
		System.out.println("Overloaded method with 1 double parameter: "+i);
	}
	
	void overLoadedMethod(double i,double j) {
		System.out.println("Overloaded method with 2 double parameter: "+i+","+j);
	}
	
	public static void main(String[] args) {
		MethodOverloading overloading=new MethodOverloading();
		overloading.overLoadedMethod(10);
		overloading.overLoadedMethod(10,20);//not throwing error int promotes to double
		overloading.overLoadedMethod(10.0);
		overloading.overLoadedMethod(10.0,20.0);
	}

}

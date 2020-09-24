package com.interfaces;

public class MyInterfaceTest implements MyInterface2{

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		MyInterface2 myInterface1=new MyInterfaceTest();
		int i=myInterface1.i;
		System.out.println(i);
		Number method1 = myInterface1.method1();
		System.out.println(method1);
		myInterface1.method2("Vivek Garg");
		myInterface1.method3();
	}

	@Override
	public Number method1() {
		System.out.println("In Method1: "+i);
		return 30;
	}

	@Override
	public void method2(String name) {
		System.out.println("In Method2: "+name);
	}

	@Override
	public void method3() {
		System.out.println("In Method3..");
	}

}

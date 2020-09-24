package com.interfaces;

class A {
	interface TestInterface {
		public abstract void displayValue();
	}
}

class B implements A.TestInterface {

	@Override
	public void displayValue() {
		System.out.println("My Nested Interface..");
	}
}

public class NestedInterfaceTest {

	public static void main(String[] args) {
        A.TestInterface testInterface=new B();
        testInterface.displayValue();
	}
}

class C implements MyInterface3.MyInterface4{

	@Override
	public void method3() {
		
	}
	
}

package com.basic;

abstract class Test1 {
	public abstract void test1();
}

@FunctionalInterface
interface Test2 {
	public abstract void test2();
	public default void test3() {
		System.out.println("Functional interface contains @Functional interface");
	}
}

public class Test extends Test1 implements Test2 {

	public void test1() {
		System.out.println("Abstarct method implementation");
	}

	public void test2() {
		System.out.println("Interface method implementation");
	}
	
	public void test4() {
		Test2 t1 = new Test2() {
			@Override
			public void test2() {
				System.out.println("Annonymous implementation");
				}
		};
		t1.test2();
	}
	
	public void test5() {
		Test2 t2 =() -> {
			System.out.println("Lambda implementation");
		};
		t2.test2();
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.test1();
		t.test2();
		t.test3();
		t.test4();
		t.test5();
	}

}

package com.innerclass;

public class MethodLocalInnerClass {

	private int outerData = 1000;

	public void display() {
		int finalData = 5000;
		class Inner {
			private int innerData = 2000;
			public void invoke() {
				System.out.println("InnerClass:invoke method is called: "+outerData);
				System.out.println("InnerClass:invoke method is called: "+innerData);
				System.out.println("InnerClass:invoke method is called: "+finalData);
			}
		}
		new Inner().invoke();
	}

	public static void main(String[] args) {

		MethodLocalInnerClass methodLocalInnerClass=new MethodLocalInnerClass();
		methodLocalInnerClass.display();
	}

}

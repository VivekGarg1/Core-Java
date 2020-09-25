package com.innerclass;

public class StaticInnerClass {
	
	private static int outerData = 1000; 
	private int nonStaticData = 2000;
	
	static class InnerClass{
		private int innerData = 3000; 
		public void invoke() {
			System.out.println("InnerClass:invoke method is called: "+outerData);
			System.out.println("InnerClass:invoke method is called: "+innerData);
			StaticInnerClass.display();
		}
	}
	
	public static void display() {
		System.out.println("Outer class display method is called..");
		InnerClass innerClass=new InnerClass();
		System.out.println("Accessing inner class data: "+innerClass.innerData);
	}

	public static void main(String[] args) {
		StaticInnerClass.InnerClass nestedInnerClass=new StaticInnerClass.InnerClass(); 
		nestedInnerClass.invoke();
	}
}

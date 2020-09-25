package com.innerclass;

public class NestedInnerClass {

	private int outerData=100;
	
	class InnerClass{
		private int innerData=200;
		public void invoke() {
			System.out.println("Inner class method invoke with outer data: "+outerData);
			NestedInnerClass.this.display();
		}
		private void display() {
			System.out.println("Inner class method is called..");
		}
	}
	
	private void display() {
		System.out.println("Outer class display method is called..");
		InnerClass innerClass=new InnerClass();
		System.out.println("Accessing inner class data: "+innerClass.innerData);
	}
	
	public static void main(String[] args) {
		NestedInnerClass.InnerClass nestedInnerClass=new NestedInnerClass().new InnerClass(); 
		nestedInnerClass.invoke();
	}

}

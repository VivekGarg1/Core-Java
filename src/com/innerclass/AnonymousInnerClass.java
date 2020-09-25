package com.innerclass;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		AnonymousInterface  anonymousInterface=new AnonymousInterface() {
			
			@Override
			public void display() {
				System.out.println("Anonymous inner class..");
			}
		};
		anonymousInterface.display();
	}

}

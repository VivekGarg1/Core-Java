package com.operators;

public class NewVSNewInstance {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//new when we know class name at the beginning
		NewVSNewInstance n=new NewVSNewInstance();
		
		//newInstance() when we don't know class name at the beginning
		Object o=Class.forName(args[0]).newInstance();
		System.out.println("Object Created for: "+o.getClass().getName());
		}

}

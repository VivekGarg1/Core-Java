package com.reflection;

public class PrivateMethodInvoke {

	private String greet(String name) {
		if(name == null || name.isEmpty())
			return "Hello Stranger!!!";
		return "Hi "+name;
	}
}

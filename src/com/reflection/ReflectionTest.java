package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.reflection.Person");
			// 1.Getting constructors of the class
			System.out.println("1.Getting constructors of the class");
			Constructor<?>[] constructors = c.getConstructors();
			System.out.println("Constructors: " + Arrays.toString(constructors));

			// 2.Getting all methods (including inherited) of the class
			System.out.println("2.Getting all methods (including inherited) of the class");
			Method[] methods = c.getMethods();
			System.out.println("Methods: " + Arrays.toString(methods));
			
			// 3.Getting all methods of the class
			System.out.println("3.Getting all methods of the class");
			Method[] declaredMethods = c.getDeclaredMethods();
			System.out.println("Declare Methods: " + Arrays.toString(declaredMethods));
			
			// 4.Getting all fields of the class
			System.out.println("4.Getting all fields of the class");
			Field[] declaredFields = c.getDeclaredFields();
			System.out.println("Declare Fields: "+declaredFields);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

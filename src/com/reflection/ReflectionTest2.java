package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTest2 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.reflection.Child");
			// 1.Getting class name
			System.out.println("------------------1.Getting class name---------------------------------");
			System.out.println("ClassName: " + c.getName());
			System.out.println("ClassName: " + c.getSimpleName());

			// 2.Getting super class using reflection
			System.out.println("---------------- 2.Getting super class using reflection-------------------");
			System.out.println("SuperClassName: " + c.getSuperclass());

			// 3.Getting implementing and extending interface and class using reflection
			System.out.println("----3.Getting implementing and extending interface using reflection----");
			System.out.println("Methods: " + Arrays.toString(c.getInterfaces()));

			// 4.Getting class modifiers using reflection
			System.out.println("-----------------4.Getting class modifiers using reflection---------------");
			int modifiers = c.getModifiers();
			System.out.println("Declare Methods: " + Modifier.toString(modifiers));

			// 5.Getting fields of the class using reflection
			System.out.println("-----------------5.Getting fields of the class using reflection------------");
			Field[] declaredFields = c.getDeclaredFields();
			System.out.println("Declare Fields: " + declaredFields);

			Field[] fields = c.getFields();
			System.out.println("Fields: " + fields);

			// 6.Getting constructors of the class
			System.out.println("-------------------6.Getting constructors of the class------------------");
			Constructor<?>[] constructors = c.getConstructors();
			System.out.println("Constructors: " + Arrays.toString(constructors));

			Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
			System.out.println("DeclaredConstructors: " + Arrays.toString(declaredConstructors));

			// 7.Getting all methods (including inherited) of the class
			System.out.println("--------------7.Getting all methods (including inherited) of the class---");
			Method[] methods = c.getMethods();
			System.out.println("Methods: " + Arrays.toString(methods));

			// 8.Getting all methods of the class
			System.out.println("------------------8.Getting all methods of the class--------------------");
			Method[] declaredMethods = c.getDeclaredMethods();
			System.out.println("Declare Methods: " + Arrays.toString(declaredMethods));

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

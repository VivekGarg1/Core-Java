package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateVariableInvokeTest {

	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("com.reflection.PrivateVariableInvoke");
			Field field = cls.getDeclaredField("message");
			field.setAccessible(true);
			Object object = field.get(new PrivateVariableInvoke());
			String result=(String) object;
			System.out.println(result);
		} catch (ClassNotFoundException | SecurityException | 
				IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

}

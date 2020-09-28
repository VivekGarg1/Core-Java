package com.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethodInvokeTest {

	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("com.reflection.PrivateMethodInvoke");
			Method method = cls.getDeclaredMethod("greet", String.class);
			method.setAccessible(true);
			Object object = method.invoke(new PrivateMethodInvoke(), "Vivek Garg");
			String result=(String) object;
			System.out.println(result);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | 
				IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}

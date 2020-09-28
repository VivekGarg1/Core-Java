package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> cls = Class.forName("com.reflection.NewInstance");
		Constructor<?>[] constructors = cls.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println("Constructors: "+constructor);
			NewInstance newInstance;
			if(Modifier.toString(constructor.getModifiers()).equalsIgnoreCase("private")) {
				constructor.setAccessible(true);
				newInstance=(NewInstance) constructor.newInstance();
			}
			else
				newInstance=(NewInstance) constructor.newInstance(200,"ConstructorTest");
			newInstance.showValue();
		}
	}

}

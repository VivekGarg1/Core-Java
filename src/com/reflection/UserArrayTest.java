package com.reflection;

import java.lang.reflect.Field;

public class UserArrayTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls = Class.forName("com.reflection.UserArray");
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			Class<?> type = field.getType();
			if (type.isArray()) {
				System.out.println("Array found: "+field.getName());
			}
		}
	}

}

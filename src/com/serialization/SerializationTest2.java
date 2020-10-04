package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest2 {

	public static void main(String[] args) {
		String fileName = "student.ser";
		serializedObject(fileName);
		deSerializedObject(fileName);
	}

	private static void deSerializedObject(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			Object object = ois.readObject();
			Student student = (Student) object;
			System.out.println("Object is deSerialized..");
			System.out.println("Id: "+student.getId());
			System.out.println("Name: "+student.getName());
			System.out.println("Age: "+student.getAge());
			System.out.println("Email: "+student.getEmail());
			System.out.println("Password: "+student.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void serializedObject(String fileName) {
        Student student=new Student();
        student.setId(101);
        student.setName("Vivek Garg");
        student.setAge(23);
        
        student.setEmail("v@gmail.com");
        student.setPassword("v@123");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(student);
			System.out.println("Object is serialized..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

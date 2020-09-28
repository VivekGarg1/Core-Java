package com.home.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		String fileName = "employee.ser";
		serializedObject(fileName);
		deSerializedObject(fileName);
	}

	private static void deSerializedObject(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			Object object = ois.readObject();
			Employee employee=(Employee) object;
			System.out.println("Object is deSerialized..");
			System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void serializedObject(String fileName) {
		Address address = new Address("Keshopur Sathla", "BilandShahr");
		Employee employee = new Employee(101, "Vivek", "Garg", "Vivek Garg", 23, address);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(employee);
			System.out.println("Object is serialized..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

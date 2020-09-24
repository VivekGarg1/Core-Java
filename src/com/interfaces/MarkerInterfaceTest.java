package com.interfaces;

public class MarkerInterfaceTest {

	public static void main(String[] args) {
		Employee employee=new Employee();
		try {
			new MarkerInterfaceService().save(employee);
		} catch (InvalidIdentityFoundException e) {
			e.printStackTrace();
		}
	}

}

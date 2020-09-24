package com.clone;

public class ShallowCloning {

	public static void main(String[] args) {
			Address address=new Address("Keshopur Sathla", "BulandShahr");
			Employee employee1=new Employee(1, "Vivek", "Garg",  "Vivek Garg", 23, address);
			
			try {
				Object clone = employee1.clone();
				Employee employee2=(Employee) clone;
				employee2.setFirstName("Prabhat Singh");
				employee2.getAddress().setCity("Rampur");
				System.out.println("Original Object: "+employee1);
				System.out.println("Clonned Object: "+employee2);
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
	}

}

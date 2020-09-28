package com.statickeyword;

public class StaticTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Vivek", "Garg", 23);
		Employee employee2 = new Employee(102, "Prabhat", "Singh", 25);

		System.out.println("Id: " + employee1.getEmpId());
		System.out.println("First name: " + employee1.getFirstName());
		System.out.println("Last name: " + employee1.getLastName());
		System.out.println("Age: " + employee1.getAge());
		System.out.println("Company name: " + Employee.COMPANY_NAME);
		System.out.println("-------------------------------");
		System.out.println("Id: " + employee2.getEmpId());
		System.out.println("First name: " + employee2.getFirstName());
		System.out.println("Last name: " + employee2.getLastName());
		System.out.println("Age: " + employee2.getAge());
		System.out.println("Company name: " + Employee.COMPANY_NAME);
	}

}

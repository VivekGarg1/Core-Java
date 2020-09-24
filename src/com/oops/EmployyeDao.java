package com.oops;

import java.util.ArrayList;
import java.util.List;

public class EmployyeDao {

	private static List<Employee> empList=null;
	static {
		empList=new ArrayList<Employee>();
		Employee employee1=new Employee();
		employee1.setEmpId(101);
		employee1.setFirstName("Vivek");
		employee1.setLastName("Garg");
		employee1.setAge(23);
		
		Employee employee2=new Employee();
		employee2.setEmpId(102);
		employee2.setFirstName("Prabhat");
		employee2.setLastName("Singh");
		employee2.setAge(25);
		
		empList.add(employee1);
		empList.add(employee2);
	}
	
	public Employee getEmployeeData(int empId) {
		Employee employee = getEmployeeById(empId);
		String employeeFullName = getEmployeeFullName(employee.getFirstName(),employee.getLastName());
		employee.setFullName(employeeFullName);
		return employee;
	}

	private String getEmployeeFullName(String firstName, String lastName) {
		return firstName+" "+lastName;
	}

	private Employee getEmployeeById(int empId) {
		for (Employee employee : empList) {
			if (employee.getEmpId() == empId) {
				return employee;
			}
		}
		return null;
	}
}

package com.oops;

public class EncapsulationTest {

	public static void main(String[] args) {
		EmployyeDao employyeDao=new EmployyeDao();
		Employee employee = employyeDao.getEmployeeData(102);
		System.out.println(employee);
	}

}

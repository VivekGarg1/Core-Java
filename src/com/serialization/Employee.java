package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 3930959914491598272L;

	private Integer empId;
	private String firstName;
	private String lastName;
	private String fullName;
	private int age;
	private Address address;

	public Employee(Integer empId, String firstName, String lastName, String fullName, int age, Address address) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.age = age;
		this.address = address;
	}

	// Aggregation
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", fullName="
				+ fullName + ", age=" + age + ", address=" + address + "]";
	}

}

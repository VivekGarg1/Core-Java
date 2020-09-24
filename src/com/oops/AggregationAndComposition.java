package com.oops;

public class AggregationAndComposition {

	public static void main(String[] args) {
		//aggregationDemo();
		compositionDemo();
	}

	@SuppressWarnings("unused")
	private static void compositionDemo() {
		Person person=new Person();
		person.setPersonId(101);
		person.setFirstName("Vivek");
		person.setLastName("Garg");
		person.getAddress().setAddressLine("Keshopur Sathla");
		person.getAddress().setCity("BulandShahr");
		
		System.out.println(person);
		person=null;
		if(person != null)
			System.out.println(person.getAddress());
		else
			System.out.println("Address does not exist!!!");
	}

	@SuppressWarnings("unused")
	private static void aggregationDemo() {
		Address address=new Address();
		address.setAddressLine("Keshopur Sathla");
		address.setCity("BulandShahr");
		
		Employee employee=new Employee();
		employee.setEmpId(101);
		employee.setFullName("Vivek Garg");
		employee.setFirstName("Vivek");
		employee.setLastName("Garg");
		employee.setAge(23);
		employee.setAddress(address);
		
		System.out.println(employee);
		employee=null;
		System.out.println(employee);
		System.out.println(address);
	}

}

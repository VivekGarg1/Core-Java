package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101, "Vivek Garg", 10000.0));
		emplist.add(new Employee(105, "Prabhat", 11000.0));
		emplist.add(new Employee(109, "Paras", 12000.0));
		emplist.add(new Employee(104, "Shubham", 13000.0));
		emplist.add(new Employee(102, "Abhinav", 14000.0));
		System.out.println("Before sorting Employee List::");
		emplist.forEach(System.out::println);

		System.out.println("-------------------------------");

		System.out.println("Sorting Employee List based on Id::");
		Collections.sort(emplist);
		emplist.forEach(System.out::println);

		System.out.println("-------------------------------");

		List<Person> personlist = new ArrayList<>();
		personlist.add(new Person(101, "Vivek Garg"));
		personlist.add(new Person(105, "Prabhat"));
		personlist.add(new Person(109, "Paras"));
		personlist.add(new Person(104, "Shubham"));
		personlist.add(new Person(102, "Abhinav"));
		System.out.println("Before sorting Person List::");
		personlist.forEach(System.out::println);
		System.out.println("-------------------------------");

		System.out.println("Sorting Person List based on Id::");
		Collections.sort(personlist,new MyComparator());
		personlist.forEach(System.out::println);
	}

}

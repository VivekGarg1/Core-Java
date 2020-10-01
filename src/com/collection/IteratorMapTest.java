package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

public class IteratorMapTest {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Vivek Garg", 11000.0);
		Employee e2=new Employee(102, "Prabhat", 12000.0);
		Employee e3=new Employee(103, "Paras", 13000.0);
		Employee e4=new Employee(104, "Hari", 14000.0);
		Employee e5=new Employee(105, "Ravi", 15000.0);
		
		Department d1=new Department(101, "IT", "Mumbai");
		Department d2=new Department(102, "Finance", "Delhi");
		
		Map<Employee,Department> map=new HashMap<>();
		map.put(e1, d1);
		map.put(e2, d1);
		map.put(e3, d1);
		
		map.put(e4, d2);
		map.put(e5, d2);
		
		Set<Entry<Employee, Department>> entrySet = map.entrySet();
		for (Entry<Employee, Department> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("--------------------------------------------");
		Set<Employee> keySet = map.keySet();
		for (Employee key : keySet) {
			Department department = map.get(key);
			System.out.println(department);
		}
		
		System.out.println("--------------------------------------------");
		Collection<Department> departments = map.values();
		departments.forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		map.forEach(new BiConsumer<Employee, Department>() {

			@Override
			public void accept(Employee key, Department value) {
				System.out.println(key);
				System.out.println(value);
			}
		});
		
		System.out.println("--------------------------------------------");
		map.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);
		});
	}

}

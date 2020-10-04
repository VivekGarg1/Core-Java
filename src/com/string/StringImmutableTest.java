package com.string;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringImmutableTest {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Vivek Garg", 11000.0,new Date());
		Employee e2=new Employee(102, "Prabhat", 12000.0,new Date());
		Employee e3=new Employee(103, "Paras", 13000.0,new Date());
		Employee e4=new Employee(104, "Hari", 14000.0,new Date());
		Employee e5=new Employee(105, "Ravi", 15000.0,new Date());
		
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
		e5.getDob().setTime(123456l);
		System.out.println(e5);
		System.out.println(map.get(e5));
	}

}

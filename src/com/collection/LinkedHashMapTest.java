package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Employee1 e1=new Employee1(101, "Vivek Garg", 11000.0);
		Employee1 e2=new Employee1(102, "Prabhat", 12000.0);
		Employee1 e3=new Employee1(103, "Paras", 13000.0);
		Employee1 e4=new Employee1(104, "Hari", 14000.0);
		Employee1 e5=new Employee1(105, "Ravi", 15000.0);
		
		Department d1=new Department(101, "IT", "Mumbai");
		Department d2=new Department(102, "Finance", "Delhi");
		
		Map<Employee1,Department> map=new LinkedHashMap<>();
		map.put(e1, d1);
		map.put(e2, d1);
		map.put(e3, d1);
		
		map.put(e4, d2);
		map.put(e5, d2);
		
		System.out.println(map.get(new Employee1(101, "Vivek Garg", 11000.0)));
		
		System.out.println(map.size());
		
		Set<Entry<Employee1, Department>> entrySet = map.entrySet();
		for (Entry<Employee1, Department> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}

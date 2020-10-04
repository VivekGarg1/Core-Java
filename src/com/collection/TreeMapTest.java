package com.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Vivek Garg", 11000.0);
		Employee e2=new Employee(102, "Prabhat", 15000.0);
		Employee e3=new Employee(103, "Paras", 10000.0);
		Employee e4=new Employee(104, "Hari", 13000.0);
		Employee e5=new Employee(105, "Ravi", 20000.0);
		
		Department d1=new Department(101, "IT", "Mumbai");
		Department d2=new Department(102, "Finance", "Delhi");
		
		Map<Employee,Department> map=new TreeMap<>();
		map.put(e1, d1);
		map.put(e2, d1);
		map.put(e3, d1);
		
		map.put(e4, d2);
		map.put(e5, d2);
		//map.put(null, d2);//java.lang.NullPointerException
		
		Set<Entry<Employee, Department>> entrySet = map.entrySet();
		Iterator<Entry<Employee, Department>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Employee,Department> entry = (Map.Entry<Employee,Department>) iterator.next();
			Employee employee = entry.getKey();
			Department department = entry.getValue();
			System.out.println(employee);
			System.out.println(department);
		}
	}

}

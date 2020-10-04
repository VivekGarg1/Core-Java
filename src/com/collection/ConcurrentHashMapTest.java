package com.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(101, "Vivek Garg", 11000.0);
		Employee1 e2 = new Employee1(102, "Prabhat", 12000.0);
		Employee1 e3 = new Employee1(103, "Paras", 13000.0);
		Employee1 e4 = new Employee1(104, "Hari", 14000.0);
		Employee1 e5 = new Employee1(105, "Ravi", 15000.0);
		Employee1 e6 = new Employee1(106, "Raju", 16000.0);

		Department d1 = new Department(101, "IT", "Mumbai");
		Department d2 = new Department(102, "Finance", "Delhi");

		Map<Employee1, Department> map = new ConcurrentHashMap<>();
		map.put(e1, d1);
		map.put(e2, d1);
		map.put(e3, d1);

		map.put(e4, d2);
		map.put(e5, d2);

		// map.put(null, d2);//java.lang.NullPointerException
		// map.put(e5, null);//java.lang.NullPointerException

		Set<Entry<Employee1, Department>> entrySet = map.entrySet();
		Iterator<Entry<Employee1, Department>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Employee1, Department> entry = (Map.Entry<Employee1, Department>) iterator.next();
			Employee1 Employee1 = entry.getKey();
			Department department = entry.getValue();
			System.out.println(Employee1);
			System.out.println(department);
			map.put(e6, d2);
		}
	}

}

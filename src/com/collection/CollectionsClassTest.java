package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsClassTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<String> empList = new ArrayList<>();
		empList.add("Vivek Garg");
		empList.add("Paras");
		empList.add("Prabhat");
		empList.add("Shubham");
		empList.add("Paras");
		empList.add("Prabhat");

		System.out.println("Original List: " + empList);
		Collections.sort(empList);
		System.out.println("Sorted List: " + empList);

		// Binary searc apply on sorted list
		int binarySearch = Collections.binarySearch(empList, "Shubham");
		System.out.println("Binary Search index: " + binarySearch);

		Collections.reverse(empList);
		System.out.println("Reverse List: " + empList);

		Collections.shuffle(empList);
		System.out.println("Suffled List: " + empList);

		System.out.println("Checking occourence of any: " + Collections.frequency(empList, "Paras"));

		Collection<String> unmodifiableCollection = Collections.unmodifiableCollection(empList);
		System.out.println("UnmodifiableCollection: " + unmodifiableCollection);
		// unmodifiableCollection.add("Ravi");//Throw an exception because it's
		// unmodifiable now

		List<String> synchronizedList = Collections.synchronizedList(empList);
		System.out.println("SynchronizedList: " + synchronizedList);

		List list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(10);
		list.add(12.5);
		Collection checkedCollection = Collections.checkedCollection(list, String.class);// Allowed only add String
																							// objects
		System.out.println("CheckedCollection: " + checkedCollection);
		// checkedCollection.add(10);
		checkedCollection.add("Raju");
		System.out.println("CheckedCollection: " + checkedCollection);

		List<String> singletonList = Collections.singletonList("Admin");
		// singletonList.add("HR");//Throw an exception
		System.out.println("SingletonList: " + singletonList);

		List<Integer> intList1 = new ArrayList<>();
		intList1.add(10);
		intList1.add(20);
		intList1.add(30);
		intList1.add(40);
		System.out.println("Original List: " + intList1);

		Collections.swap(intList1, 0, 3);
		System.out.println("After Calling swap: " + intList1);

		List<Integer> intList2 = new ArrayList<>();
		intList2.add(50);
		intList2.add(60);

		Collections.copy(intList1, intList2);
		System.out.println("IntList1: " + intList1);
		System.out.println("IntList2: " + intList2);

		List<String> personList = new ArrayList<>();
		personList.add("Vivek Garg");
		personList.add("Paras");
		personList.add("Prabhat");
		personList.add("Shubham");
		personList.add("Paras");
		personList.add("Prabhat");

		System.out.println("Minimum element of the personList List: " + Collections.min(personList));
		System.out.println("Maximum element of the personList List: " + Collections.max(personList));

		List<Integer> intList3 = new ArrayList<>();
		intList3.add(100);
		intList3.add(200);
		intList3.add(300);
		intList3.add(400);

		List<Integer> intList4 = new ArrayList<>();
		intList4.add(10);
		intList4.add(20);
		intList4.add(30);
		intList4.add(400);

		boolean disjoint = Collections.disjoint(intList3, intList4);
		System.out.println(disjoint);

		List emptyList = Collections.EMPTY_LIST;
		Map emptyMap = Collections.EMPTY_MAP;
		Set emptySet = Collections.EMPTY_SET;
		System.out.println(emptyList);
		System.out.println(emptyMap);
		System.out.println(emptySet);

		Enumeration<Integer> enumeration = Collections.enumeration(intList3);
		while (enumeration.hasMoreElements()) {
			Integer integer = enumeration.nextElement();
			System.out.println(integer);
		}
		
		List<Integer> intList5=Collections.nCopies(5,2000);
		System.out.println(intList5);
	}

}

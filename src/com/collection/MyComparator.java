package com.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getId().compareTo(o2.getId());
	}

}

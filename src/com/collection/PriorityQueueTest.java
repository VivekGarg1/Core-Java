package com.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		Comparator< String> comparator=new VowelComparator();
		PriorityQueue<String> pq=new PriorityQueue<String>(10, comparator);
		pq.add("orange");
		pq.add("fig");
		pq.add("watermelon");
		pq.add("lemon");
		while (pq.size() !=0) {
			System.out.println(pq.remove());
		}
	}

}

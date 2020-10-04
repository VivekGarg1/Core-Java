package com.collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("IsEmpty: "+stack.isEmpty());
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.add(6);
		System.out.println("Stack elements: "+stack);
		Integer peek = stack.peek();
		System.out.println("Peek element: "+peek);
		int search = stack.search(4);
		System.out.println("Search element Index is: "+search);
		Integer pop = stack.pop();
		System.out.println("Pop element: "+pop);
	}

}

package com.linkedlist;

import java.util.NoSuchElementException;

public class RemoveFirstNodeTest<T> {

	private Node<T> head;

	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	public void insert(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null)
			head = newNode;
		else {
			Node<T> currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}
	
	public T removeFirst() {
		if(head == null)
			throw new NoSuchElementException("List is empty...");
		Node<T> temp=head;
		head=head.next;
		T result=temp.data;
		return result;		
	}

	public void displaylinkedList() {
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + "->");
			currentNode=currentNode.next;
			}
		System.out.println(currentNode);
	}

	public static void main(String[] args) {
		RemoveFirstNodeTest<Integer> linkedList = new RemoveFirstNodeTest<Integer>();
		linkedList.insert(11);
		linkedList.insert(12);
		linkedList.insert(13);
		linkedList.insert(14);
		linkedList.insert(15);
		linkedList.displaylinkedList();
		Integer result = linkedList.removeFirst();
		linkedList.displaylinkedList();
		System.out.println("Deleted element is: "+result);
	}

}

package com.linkedlist;

public class FindSizeOfLinkedListTest<T> {

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

	public int size() {
		int length = 0;
		if (head == null)
			return length;
		Node<T> currentNode = head;
		while (currentNode != null) {
			currentNode = currentNode.next;
			length++;
		}
		return length;
	}

	public void displaylinkedList() {
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.next;
		}
		System.out.println(currentNode);
	}

	public static void main(String[] args) {
		FindSizeOfLinkedListTest<Integer> linkedList = new FindSizeOfLinkedListTest<Integer>();
		linkedList.insert(11);
		linkedList.insert(12);
		linkedList.insert(13);
		linkedList.insert(14);
		linkedList.insert(15);
		linkedList.displaylinkedList();
		int size = linkedList.size();
		System.out.println("LinkedList size is: "+size);
	}

}

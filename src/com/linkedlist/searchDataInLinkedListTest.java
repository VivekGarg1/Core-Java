package com.linkedlist;

public class searchDataInLinkedListTest<T> {

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
			Node<T> currentNode=head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	public boolean contains(T searchKey) {
		if(head == null)
			return false;
		Node<T> currentNode = head;
		while (currentNode != null) {
			if(currentNode.data == searchKey) {
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;				
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
		searchDataInLinkedListTest<Integer> linkedList = new searchDataInLinkedListTest<Integer>();
		linkedList.insert(11);
		linkedList.insert(13);
		linkedList.insert(14);
		linkedList.insert(15);
		linkedList.displaylinkedList();
		int searchValue=16;
		boolean contains = linkedList.contains(searchValue);
		System.out.println(searchValue+" is exist in list? "+contains);

	}

}

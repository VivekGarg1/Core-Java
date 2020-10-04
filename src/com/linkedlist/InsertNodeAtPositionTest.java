package com.linkedlist;

public class InsertNodeAtPositionTest<T> {

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

	public void insertAtPosition(T data, int position) {
		Node<T> newNode = new Node<T>(data);
		if(position<0)
			throw new IllegalArgumentException("Please provide valid position...");
		if(position == 0) {
			newNode.next=head;
			head=newNode;
			return;
		}
		Node<T> currentNode = head;
		for (int i = 0; i < position-1; i++) {
			currentNode = currentNode.next;
			if(currentNode==null)
				throw new IllegalArgumentException("Provided position value is greater than no. of nodes in list...");
			}
		newNode.next=currentNode.next;
		currentNode.next=newNode;		
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
		InsertNodeAtPositionTest<Integer> linkedList = new InsertNodeAtPositionTest<Integer>();
		linkedList.insert(11);
		linkedList.insert(13);
		linkedList.insert(14);
		linkedList.insert(15);
		linkedList.displaylinkedList();
		
		int position=1;
		int newValue=12;
		linkedList.insertAtPosition(newValue, position);
		linkedList.displaylinkedList();
	}

}

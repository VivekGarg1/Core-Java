package com.linkedlist;

public class InsertNodeAtEndTest<T> {

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

	public void insertEnd(T data) {
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

	public void displaylinkedList() {
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.next;
		}
		System.out.println(currentNode);
	}

	public static void main(String[] args) {
		InsertNodeAtEndTest<Integer> linkedList = new InsertNodeAtEndTest<Integer>();
		linkedList.insertEnd(4);
		linkedList.insertEnd(5);
		linkedList.insertEnd(6);
		linkedList.insertEnd(7);
		linkedList.displaylinkedList();
	}

}

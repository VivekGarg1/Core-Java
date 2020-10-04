package com.linkedlist;

public class CircularLinkedListTest<T> {

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

	public void insert(Node<T> newNode) {
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
		System.out.println("vhh");
		while (currentNode != null) {
			System.out.print(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head=new Node<Integer>(10);
		Node<Integer> secondNode=new Node<Integer>(20);
		Node<Integer> thirdNode=new Node<Integer>(30);
		Node<Integer> fourthNode=new Node<Integer>(40);
		Node<Integer> fifthNode=new Node<Integer>(50);
		CircularLinkedListTest<Integer> linkedList = new CircularLinkedListTest<Integer>();
		linkedList.insert(head);
		linkedList.insert(secondNode);
		linkedList.insert(thirdNode);
		linkedList.insert(fourthNode);
		linkedList.insert(fifthNode);
		//2nd time add forth node reference
		linkedList.insert(fourthNode);
		linkedList.displaylinkedList();
	}

}

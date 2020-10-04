package com.linkedlist;

public class FindMiddleElementTest<T> {

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

	public T middleElement() {
		if (head == null)
			return null;
		Node<T> slowReference=head;
		Node<T> fastReference=head;
		while(fastReference != null && fastReference.next != null) {
			slowReference=slowReference.next;
			fastReference=fastReference.next.next;
		}
		return slowReference.data;
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
		FindMiddleElementTest<Integer> linkedList = new FindMiddleElementTest<Integer>();
		linkedList.insert(11);
		linkedList.insert(12);
		linkedList.insert(13);
		linkedList.insert(14);
		linkedList.insert(15);
		linkedList.displaylinkedList();
		int middleElement = linkedList.middleElement();
		System.out.println("Middle element is: "+middleElement);
	}

}

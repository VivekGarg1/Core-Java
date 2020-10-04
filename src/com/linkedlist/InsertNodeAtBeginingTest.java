package com.linkedlist;

public class InsertNodeAtBeginingTest<T> {

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

	public void insertFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
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
       InsertNodeAtBeginingTest<Integer> linkedList=new InsertNodeAtBeginingTest<Integer>();
       linkedList.insertFirst(5);
       linkedList.insertFirst(4);
       linkedList.displaylinkedList();
	}

}

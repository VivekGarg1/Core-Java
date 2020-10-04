package com.linkedlist;

public class LinkedListTest<T> {

	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head=new Node<Integer>(10);
		Node<Integer> secondNode=new Node<Integer>(20);
		Node<Integer> thirdNode=new Node<Integer>(30);
		Node<Integer> fourthNode=new Node<Integer>(40);
		Node<Integer> fifthNode=new Node<Integer>(50);
		
		head.next=secondNode;
		secondNode.next=thirdNode;
		thirdNode.next=fourthNode;
		fourthNode.next=fifthNode;
		
		Node<Integer> currentNode=head;
		while (currentNode != null) {
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
			System.out.println(currentNode);
		}
	}
}

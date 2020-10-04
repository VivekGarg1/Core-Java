package com.linkedlist;

public class CheckCycle_LoopTest<T> {

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
			Node<T> currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	public boolean checkCycleOrLoop() {
		if (head == null)
			return false;
		Node<T> slowReference = head;
		Node<T> fastReference = head;
		while (fastReference != null && fastReference.next != null) {
			slowReference = slowReference.next;
			fastReference = fastReference.next.next;
			if (slowReference == fastReference)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(10);
		Node<Integer> secondNode = new Node<Integer>(20);
		Node<Integer> thirdNode = new Node<Integer>(30);
		Node<Integer> fourthNode = new Node<Integer>(40);
		Node<Integer> fifthNode = new Node<Integer>(50);
		CheckCycle_LoopTest<Integer> linkedList = new CheckCycle_LoopTest<Integer>();
		linkedList.insert(head);
		linkedList.insert(secondNode);
		linkedList.insert(thirdNode);
		linkedList.insert(fourthNode);
		linkedList.insert(fifthNode);
		// 2nd time add forth node reference
		linkedList.insert(fourthNode);
		boolean checkCycleOrLoop = linkedList.checkCycleOrLoop();
		System.out.println(checkCycleOrLoop);
	}
}

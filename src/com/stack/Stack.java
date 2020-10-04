package com.stack;

import java.util.EmptyStackException;

public class Stack {

	private int maxSize;
	private int[] stackArray;
	private int top;

	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.stackArray = new int[maxSize];
		this.top = -1;
	}

	public void push(int data) {
		if (isFull())
			throw new RuntimeException("Stack is full");
		stackArray[++top] = data;
	}

	public int pop() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		return stackArray[top--];
	}

	public int peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return stackArray[top];
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}
}

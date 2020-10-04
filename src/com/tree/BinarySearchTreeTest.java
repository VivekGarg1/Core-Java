package com.tree;

import java.util.Arrays;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		int[] inputArrayElements= {100,10,20,30,120,110,105};
		System.out.println("Original Array: "+Arrays.toString(inputArrayElements));
		
		BinarySearchTree binarySearchTree=new BinarySearchTree(inputArrayElements[0]);
		for (int data : inputArrayElements) {
			binarySearchTree.insert(binarySearchTree.node, data);
		}
		System.out.println("After soting::");
		binarySearchTree.inOrder(binarySearchTree.node);
	}

}

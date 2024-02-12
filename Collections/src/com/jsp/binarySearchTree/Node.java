package com.jsp.binarySearchTree;

public class Node 
{
	int key;
	Node left;
	Node right;
	
	public Node(int k) {
		key=k;
	}
	
	public Node(int k,Node l,Node r) {
		key=k;
		left=l;
		right=r;
	}
	
}

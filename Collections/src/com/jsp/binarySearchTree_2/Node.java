package com.jsp.binarySearchTree_2;

public class Node 
{
	Object key;
	Node left;
	Node right;
	
	public Node(Object k) {
		key =k;
	}
	
	public Node(Object k,Node l,Node r) {
		key=k;
		left=l;
		right=r;
	}
}

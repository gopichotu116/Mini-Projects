package com.jsp.hashing;

public class Node 
{
	int key;
	Node next;
	
	public Node(int k) {
		key=k;
	}
	
	public Node(int k,Node n) {
		key=k;
		next=n;
	}
}

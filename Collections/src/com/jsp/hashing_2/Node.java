package com.jsp.hashing_2;

public class Node 
{
	Object key;
	Node next;
	
	public Node(Object k) {
		key=k;
	}
	
	public Node(Object k,Node n) {
		key=k;
		next=n;
	}
}

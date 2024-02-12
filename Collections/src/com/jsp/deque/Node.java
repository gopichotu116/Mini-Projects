package com.jsp.deque;

public class Node 
{
	Object key;
	Node next;
	
	public Node(Object key, Node next) {
		super();
		this.key = key;
		this.next = next;
	}
	
	public Node(Object key) {
		this.key=key;
	}
}

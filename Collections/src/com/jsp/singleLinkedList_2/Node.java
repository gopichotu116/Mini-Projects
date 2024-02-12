package com.jsp.singleLinkedList_2;

public class Node 
{
	Object ele;
	Node next;
	
	public Node(Object e) {
		ele=e;
	}
	
	public Node(Object e,Node n) {
		ele=e;
		next=n;
	}
	
}

package com.jsp.singleLinkedList;

public class Node {
	public Object ele;
	public Node next;
	
	public Node(Object e)
	{
		ele=e;
	}
	
	public Node(Object e,Node n)
	{
		ele=e;
		next=n;
	}
	
}

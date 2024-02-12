package com.jsp.doubleLinkedList_1;

public class Node 
{
	public Object ele;
	public Node next;
	public Node prev;
	
	public Node(Object e)
	{
		ele=e;
	}
	
	public Node(Object e,Node n,Node p)
	{
		ele=e;
		next=n;
		prev=n;
	}
}

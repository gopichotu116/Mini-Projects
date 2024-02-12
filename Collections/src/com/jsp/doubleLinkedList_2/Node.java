package com.jsp.doubleLinkedList_2;

public class Node {
	Object ele;
	Node next;
	Node prev;
	
	Node(Object e)
	{
		ele=e;
	}
	
	Node(Object e,Node n,Node p)
	{
		ele=e;
		next=n;
		prev=p;
	}
}

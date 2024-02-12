package com.jsp.doubleLinkedList_2;

import java.util.Iterator;

public class DoubleLinkedList <E>{
	
	private Node first=null;
	private int count=0;
	
	// adding the elements by using add method
	public void add(E e)
	{
		if(first==null)
		{
			first=new Node(e);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,null,curr);
		count++;
	}
	
	// count how many elements are present
	public int size()
	{
		return count;
	}
	
	// check the index which is given by the user
	private void checkIndex(int index)
	{
		if(index<=-1||index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
	}
	
	// get the elements 
	public E get(int index)
	{
		checkIndex(index);
		Node curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return (E)curr.ele;
	}
	// add element in between the nodes
	public void add(int index,E e)
	{
		checkIndex(index);
		if(index==0)
		{
			Node n=new Node(e,first,null);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		Node n=new Node(e,curr.next,curr);
		curr.next.prev=n;
		curr.next=n;
		count++;
	}
	
	// remove elements based on their indexes
	public void remove(int index)
	{
		checkIndex(index);
		if(index==0)
		{
			first=first.next;
			first.prev=null;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		curr.next.prev=curr;
		count--;
	}
	
	// clear all elements
	public void clearAll()
	{
		 first=null;
		 count=0;
	}
	
	public void reverse()
	{
		Node prev=null;
		Node next=null;
		Node curr=first;
		while(curr!=null)
		{
			next=curr.next;
			curr.prev=next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
	
	@Override
	public String toString()
	{
		if(first==null) return getClass().getSimpleName()+"[]";
		Node curr=first;
		String s=getClass().getSimpleName()+"["+curr.ele;
		while(curr.next!=null)
		{
			curr=curr.next;
			s=s+","+curr.ele;
		}
		s=s+"]";
		return s;
	}

}















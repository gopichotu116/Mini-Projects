package com.jsp.singleLinkedList;

public class SingleLinkedList {
	private Node first=null;
	private int count=0;
	
	// Adding new node
	public void add(Object e)
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
		curr.next= new Node(e);
		count++;
	}
	// count no.of nodes
	public int size()
	{
		return count;
	}
	// checking indexes
	public void checkIndex(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
	}
	// get the element
	public Object get(int index)
	{
		checkIndex(index);
		Node curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	// add element in between
	public void add(int index,Object e)
	{
		checkIndex(index);
		if(index==0)
		{
			first=new Node(e,first);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		count++;
	}
	public void remove(int index)
	{
		checkIndex(index);
		if(index==0)
		{
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void reverse()
	{
		Node prev=null;
		Node next=null;
		Node curr=first;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
	@Override
	public String toString()
	{
		if(first==null) return "[]";
		Node curr=first;
		String s="["+curr.ele;
		while(curr.next!=null)
		{
			curr=curr.next;
			s=s+","+curr.ele;
		}
		s=s+"]";
		return s;
	}
}
















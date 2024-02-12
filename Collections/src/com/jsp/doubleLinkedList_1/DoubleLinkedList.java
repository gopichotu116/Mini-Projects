  package com.jsp.doubleLinkedList_1;

public class DoubleLinkedList
{
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first = new Node(e);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null,last);
		last=last.next;
		count++;
	}
	
	public int size()
	{
		return count;
	}
	
	private void checkIndex(int index)
	{
		if(index<=-1 || index>=size())
		throw new IndexOutOfBoundsException();
	}
	
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
	
	public void clear()
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
//			curr.prev=next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
	
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
		if(index==size()-1) {
			curr.next=null;
			last=curr;
			count--;
//			return;
		}
		else {
		curr.next=curr.next.next;
		curr.next.prev=curr;
		count--;
		}
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void add(int index,Object e)
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
}






















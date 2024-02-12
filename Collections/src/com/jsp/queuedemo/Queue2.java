package com.jsp.queuedemo;

import java.util.EmptyStackException;

import com.jsp.singleLinkedList.Node;

public class Queue2 
{
	private Node first =null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e);
			last =first;
			count++;
			return;
		}
		last.next=new Node(e);
		last=last.next;
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public Object peek() {
		if(isEmpty()) throw new EmptyStackException();
		return first.ele;
	}
	
	public Object poll() {
		if(isEmpty()) throw new EmptyStackException();
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
	
	public void clear() {
		first=null;
		count=0;
	}
	
	@Override
	public String toString() {
		if(first==null) return "[]";
		Node curr=first;
		String s="["+curr.ele;
		while(curr.next!=null) {
			curr=curr.next;
			s=s+","+curr.ele;
		}
		s=s+"]";
		return s;
	}
}















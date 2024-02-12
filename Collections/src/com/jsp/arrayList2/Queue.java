package com.jsp.arrayList2;

import java.util.EmptyStackException;

public class Queue 
{
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e);
			last=first;
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
}

















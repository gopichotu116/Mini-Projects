package com.jsp.queuedemo;

import java.util.EmptyStackException;

import com.jsp.singleLinkedList.Node;

public class Queue3<E>
{
	private Node first =null;
	private Node last=null;
	private int count=0;
	
	public void add(E e) {
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
	
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return (E)first.ele;
	}
	
	public E poll() {
		if(isEmpty()) throw new EmptyStackException();
		Object e=first.ele;
		first=first.next;
		count--;
		return (E)e;
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

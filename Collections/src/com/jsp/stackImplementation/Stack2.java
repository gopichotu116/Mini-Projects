package com.jsp.stackImplementation;

import java.util.EmptyStackException;

import com.jsp.singleLinkedList.Node;

public class Stack2 
{
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void push(Object e) {
		if(first==null) {
			first=new Node(e);
			last =first;
			count++;
			return;
		}
		last.next= new Node(e);
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
		return last.ele;
	}
	
	public Object pop() {
		if(isEmpty()) throw new EmptyStackException();
		Node curr=first;
		for(int i=1;i<size()-1;i++) {
			curr=curr.next;
		}
		Object e=last.ele;
		last=curr;
		count--;
		if(size()==0)first=null;  
		return e;
	}
	@Override
	public String toString() {
		if(size()==0) return "[]";
		Node curr=first;
		String s="["+curr.ele;
		while(curr.next!=null) {
			curr=curr.next;
			s=s+","+curr.ele;
		}
		s=s+"]";
		return s;
	}
	
//	public Object pop() {
//		if(last==null) return null;
//		Object e=last.ele;
//		Node curr=first,prev=null;
//		while(curr.next!=null) {
//			prev=curr;
//			curr=curr.next;
//		}
//		if(first.next==null) {
//			last=first.next;
//			first=last;
//			count--;
//		}
//		else {
//			prev.next=curr.next;
//			last=prev;
//			count--;
//		}
//		return e;
//	}
	
	public Object peekLast() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return last.ele;
	} 
	
	public boolean search(Object e) {
		Node curr=first;
		while(curr!=null) {
			if(curr.ele.equals(e)) return true;
			curr=curr.next;
		}
		return false;
	}
}














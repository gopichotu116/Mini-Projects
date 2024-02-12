package com.jsp.singleLinkedList_2;

public class SingleLinkedList <E>
{
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(E e) {
		if(first==null) {
			first=new Node(e);
			last= first;
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
	
	private void checkIndex(int index) {
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public E get(int index) {
		checkIndex(index);
		Node curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return (E)curr.ele;
	}
	
	public void add(int index,E e) {
		checkIndex(index);
		if(index==0) {
			Node n=new Node(e,first);
			first.next=n;
			first=n;
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node n=new Node(e,curr.next);
		curr.next.next=n;
		curr.next=n;
		count++;
	}
	
	public void remove(int index) {
		checkIndex(index);
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	
	@Override
	public String toString() {
		if(first==null) return "[]";
		Node curr=first;
		String s="["+curr.ele;
		while(curr.next!=null) {
			curr=curr.next;
			s+=","+curr.ele;
		}
		s+="]";
		return s;
	}
	
	public void clear() {
		first=null;
		count=0;
	}
	
	public void reverse() {
		Node next=null;
		Node prev=null;
		Node curr=first;
		while(curr!=null) {
			next =curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
}
















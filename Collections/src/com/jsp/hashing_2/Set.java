package com.jsp.hashing_2;

public class Set 
{
	private Node[] a=new Node[10];
	private int count=0;
	
	public boolean add(Object k) {
		int index=k.hashCode()%a.length;
		if(a[index]==null) {
			a[index]=new Node(k);
			count++;
			return true;
		}
		Node prev=null;
		Node curr=a[index];
		while(curr!=null) {
			if(k.equals(curr.key)) return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(k);
		count++;
		return true;
	}
	
	public int size() {
		return count;
	}
	
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.println(curr.key+" ");
				curr=curr.next;
			}
		}
		System.out.println();
	}
	
	public String toString() {
		display();
		return "";
	}
}


















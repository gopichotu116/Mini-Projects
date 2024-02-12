package com.jsp.queuedemo;

import java.util.EmptyStackException;

public class Queue 
{
	private Object [] a=new Object[5];
	private int p=0;
	
	public void add(Object e) {
		if(p>=a.length) increase();
		a[p++]=e;
	}
	
	private void increase() {
		Object [] temp=new Object[((a.length*3)/2)+1];
		System.arraycopy(a,0, temp, 0, a.length);
		a=temp;
	}
	
	public int size() {
		return p;
	}
	
	@Override
	public String toString() {
		if(p==0) return "[]";
		String s="["+a[0];
		for(int i=1;i<size();i++) {
			s=s+","+a[i];
		}
		s=s+"]";
		return s;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public Object peek() {
		if(isEmpty()) throw new EmptyStackException();
		return a[0];
	}
	
	public Object poll() {
		if(isEmpty()) throw new EmptyStackException();
		Object e=a[0];
		for(int i=1;i<size();i++) {
			a[i-1]=a[i];
		}
		a[--p]=null;
		return e;
	}
	
	public Object get(int index)
	{
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
}


















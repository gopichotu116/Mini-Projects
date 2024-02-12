package com.jsp.stackImplementation;

import java.util.EmptyStackException;

public class Stack  // Last In First Out (LIFO)
{
	private Object [] a=new Object[5];
	private int p=0;
	
	public void push(Object e) {
		if(p>=a.length) increase();
		a[p++]=e;
	}
	
	private void increase() {
		Object temp[]=new Object[a.length*2];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	
	public int size() {
		return p;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	private void checkEmpty() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
	}
	
	public Object peek() {
		checkEmpty();
		return a[p-1];
	}
	
	public Object pop() {
		checkEmpty();
		Object e=a[p-1];
		a[--p]=null;
		return e;
	}
	
	@Override
	public String toString()
	{
		if(p==0) return "[]";
		String s="["+a[0];
		for(int i=1;i<size();i++) {
			s=s+","+a[i];
		}
		s=s+"]";
		return s;
	}
	
	public void clear() {
		a=new Object[5];
		p=0;
	}
	
	public Object peekFirst() {
		checkEmpty();
		return a[0];
	}
	
	public Object popFirst() {
		checkEmpty();
		Object e=a[0];
		for(int i=1;i<size();i++)
		{
			a[i-1]=a[i];
		}
		a[--p]=null;
		return e;
	}
	
	public boolean search(Object e) {
		for(int i=0;i<size();i++) {
			if(a[i]==e) return true;
		}
		return false;
	}
}
















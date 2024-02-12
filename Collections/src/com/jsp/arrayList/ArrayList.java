package com.jsp.arrayList;

public class ArrayList 
{
	private Object a[]=new Object[5];
	private int p=0;
	
	
	public void add(Object e) {
		if(p>=a.length) increase();
		a[p++]=e;
	}
	private void increase() {
		Object temp[] =new Object[a.length+5];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	
	public int size() {
		return p;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void reverse() {
		int i=0,j=p-1;
		while(i<j) {
			Object temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	
	private void checkIndex(int index) {
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void add(int index,Object e) {
		checkIndex(index);
		if(p>=a.length) increase();
		for(int i=size()-1;i>=index;i--) {
			a[i+1] =a[i];
		}
		a[index]=e;
		p++;
	}
	
	public Object get(int index) {
		checkIndex(index);
		return a[index];
	}
	
	public void clear() {
		a=new Object[5];
		p=0;
	}
	
	public void remove(int index) {
		checkIndex(index);
		for(int i=index+1;i<size();i++) {
			a[i-1]=a[i];
		}
		a[--p]=null;
	}
	
	@Override
	public String toString() {
		if(p==0) return "[]";
		String s="["+a[0];
		for(int i=1;i<size();i++) {
			s+=","+a[i];
		}
		s+="]";
		return s;
	}
	
	public int indexOf(Object e) {
		for(int i=0;i<size();i++) {
			if(a[i]==e) {
				 return i;
			}
		}
		return -1;
	}
	
	public boolean contains(Object e) {
		for(int i=0;i<size();i++) {
			if(a[i]==e) return true;
		}
		return false;
	}
	
//	public void removeObject(Object e) {
//		int n=0;
//		for(int i=0;i<size();i++) {
//			for(int j=0;j<size();j++) {
//				if(a[i]==e) {
//					for(int k=n+1;k<size();k++) {
//						a[k-1]=a[k];
//					}
//					a[--p]=null;
//				}
//			}
//		}
//	}
}














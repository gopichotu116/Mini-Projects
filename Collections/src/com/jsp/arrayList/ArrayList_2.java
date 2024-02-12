package com.jsp.arrayList;

public class ArrayList_2<A>
{
	private Object [] a=new Object[10];
	private int p=0;
	
	// add elements
	public void add(A e)
	{
		if(p>=a.length) increase();
		a[p]=e;
		p++;
	}
	public void add(int index,A e)
	{
		checkIndex(index);
		if(p>=a.length) increase();
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}
	// increasing the array size
	private void increase() {
		Object [] temp=new Object[((a.length*3)/2)+1];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	
	// size method to find how many products are present in my array
	public int size()
	{
		return p;
	}
	
	private void checkIndex(int index)
	{
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public A get(int index) {
		checkIndex(index);
		return (A)a[index];
	}
	
	@Override
	public String toString()
	{
		if(p==0) return getClass().getSimpleName()+"[]";
		String s=getClass().getSimpleName()+"["+a[0];
		for(int i=1;i<size();i++) {
			s=s+","+a[i];
		}
		s=s+"]";
		return s;
	}
	
	public  void reverse() {
		int i=0,j=p-1;
		while(i<j) {
			A temp=(A)a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	
}


















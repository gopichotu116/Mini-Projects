package com.jsp.singleLinkedList;

public class Demo 
{
	public static void main(String[] args) 
	{
		SingleLinkedList l=new SingleLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add("siva");
		l.add(3,90);
		System.out.println("count="+l.size());
//		l.reverse();
//		int sum=0;
//		for(int i=0;i<l.size();i++)
//		{
//			sum+=(l.get(i);
//		}
		System.out.println(l);
		
	}

}

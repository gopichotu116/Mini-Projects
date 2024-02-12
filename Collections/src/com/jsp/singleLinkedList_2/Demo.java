package com.jsp.singleLinkedList_2;

public class Demo 
{
	public static void main(String[] args) 
	{
		SingleLinkedList<Integer> s = new SingleLinkedList<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
//		s.remove(4);
		int sum=0;
		for(int i=0;i<s.size();i++) {
			sum+=s.get(i);
		}
		System.out.println(sum);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}

}

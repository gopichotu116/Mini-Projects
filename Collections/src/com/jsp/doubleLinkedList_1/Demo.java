package com.jsp.doubleLinkedList_1;

public class Demo 
{
	public static void main(String[] args) 
	{
		DoubleLinkedList d = new DoubleLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
//		d.add(50);
//		d.add(60);
//		d.remove(5);
//		d.remove(4);
//		d.remove(3);
//		d.remove(2);
//		d.remove(1);
//		d.remove(0);
//		d.add(4,70);
//		int sum=0;
		System.out.println(d);
		d.reverse();
//		for(int i=0;i<d.size();i++) {
//			sum+=d.get(i);
//		}
		System.out.println(d);
//		System.out.println(sum);
		System.out.println(d.size());
	}

}

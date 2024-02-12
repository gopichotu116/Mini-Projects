package com.jsp.doubleLinkedList_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args) 
	{
		LinkedList <Integer>d=new LinkedList<Integer>();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(4);
		d.add(4);
		d.add(4,70);
		System.out.println(d);
		Iterator i = d.iterator();
		System.out.println(i);
		System.out.println("Size="+d.size());
		System.out.println();
		DoubleLinkedList <String>d1=new DoubleLinkedList<String>();
		d1.add("Gopichand");
		d1.add("Bhaskar");
		d1.add("SaiKumar");
		d1.add("Timma Reddy");
		d1.add("Harish");
		System.out.println(d1);
		System.out.println("Size="+d1.size());
	}

}

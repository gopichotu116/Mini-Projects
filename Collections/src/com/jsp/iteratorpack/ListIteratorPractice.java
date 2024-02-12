package com.jsp.iteratorpack;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(60);
		ListIterator<Integer> li = al.listIterator();
//		while(li.hasNext())
//			System.out.println(li.next());
//		System.out.println();
//		li.add(90);
//		while(li.hasPrevious())
//			System.out.println(li.previous());
//		li.remove();
//		System.out.println(al);
		while(li.hasNext()) {
			System.out.println(li.next());
			li.add(20);
		}
	}
}

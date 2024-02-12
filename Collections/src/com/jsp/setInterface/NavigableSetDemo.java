package com.jsp.setInterface;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		NavigableSet  s = new TreeSet();
		s.add(20);
		s.add(10);
		s.add(50);
		s.add(30);
		s.add(60);
		System.out.println(s.ceiling(2));
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.higher(20));
		System.out.println(s.lower(20));
		Iterator itr = s.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(s);
	}
}

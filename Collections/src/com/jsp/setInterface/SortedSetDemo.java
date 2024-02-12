package com.jsp.setInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet t = new TreeSet<>();
		t.add(10);
		t.add(5);
		t.add(2);
		t.add(7);
		t.add(12);
		System.out.println(t.first());
		System.out.println(t.last());
		t.forEach(System.out::println);
		SortedSet t1=t.headSet(10);
		System.out.println(t1); // print less than 10
		SortedSet t2=t.tailSet(7);
		System.out.println(t2); // print greaterthan equls to 7
		SortedSet t3=t.subSet(5, 12); // print greaterthan equals to 5 and less than 12
		System.out.println(t3);
	}
}

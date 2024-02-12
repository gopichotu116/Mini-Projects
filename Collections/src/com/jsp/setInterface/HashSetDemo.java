package com.jsp.setInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> h = new HashSet<String>();
		h.add("Ajay");
		h.add("Gopi");
		h.add("Madhu");
		h.add("Mama");
		h.add("Vijay");
		h.add(null);
		System.out.println(h.isEmpty());
//		h.clear();
		Set<String> h1 = new HashSet<String>();
		h1.add("Tiru");
		h1.add("Madhu");
		h1.add("Boss");
		h1.add("Kali");
		h1.add(null);
//		h.removeAll(h1);
//		h.forEach(System.out::println);
		h.addAll(h1);
//		h.retainAll(h1); // removes all elements and replace with new elements
		h.forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		h1.forEach(System.out::println);
	}
}

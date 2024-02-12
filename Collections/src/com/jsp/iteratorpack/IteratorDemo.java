package com.jsp.iteratorpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {
	public static void main(String[] args) {
		List<Integer> al = new CopyOnWriteArrayList();
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(60);
		al.add(50);
		System.out.println(al);
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			al.add(70); // ConcurrentModificationException
		}
		System.out.println(al);
		// hasNext() - boolean
		// next() - E
		// remove() - void
//		while(itr.hasNext()) {
//			itr.remove(); IllegalThreadException() 
//			why becuase without calling next() method we can't use remove() method
//		}
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		while(itr.hasNext()) {
//			itr.next();
//			itr.remove(); // it will work
//		}
//		System.out.println(al);
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "India");
		hm.put(2, "Britan");
		hm.put(3, "USA");
		hm.put(4, "UK");
//		Iterator<Entry<Integer, String>> i = hm.entrySet().iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		Iterator<Integer> i = hm.keySet().iterator();
//		while(i.hasNext())
//			System.out.println(i.next());
		
		Iterator<String> i = hm.values().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();
			System.out.println(i.next());
		}
		System.out.println(hm);
	}
}

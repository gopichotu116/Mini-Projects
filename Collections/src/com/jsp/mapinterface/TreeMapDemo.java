package com.jsp.mapinterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		SortedMap<String, Integer> tm = new TreeMap<>();
		tm.put("Gopi", 20);
		tm.put("Gopi", 21);
		tm.put("Bhaskar", 23);
		tm.put("Tiru", 22);
		tm.put("Naveen", 21);
		tm.put("Madhu", 26);
		System.out.println(tm);
//		System.out.println(tm.ceilingEntry("Tiru"));
		System.out.println(tm.headMap("Naveen"));
		System.out.println(tm.tailMap("Naveen"));
		System.out.println(tm.subMap("Gopi", "Tiru"));
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
//		System.out.println(tm.firstEntry());
//		System.out.println(tm.lastEntry());
	}
}

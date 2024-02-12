package com.jsp.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println(map.put("Gopi", 20));
		System.out.println(map.put("Gopi", 21));
		map.put("Bhaskar", 23);
		map.put("Tiru", 22);
		map.put("Naveen", 21);
		map.put("Madhu", 26);
//		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			Entry<String, Integer> s = itr.next();
		}
		System.out.println(map.containsKey("Goi"));
		System.out.println(map.containsValue(26));
		System.out.println(map.get("Bhaskar"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
}

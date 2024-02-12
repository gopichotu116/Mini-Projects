package com.jsp.mapinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> hm = new LinkedHashMap<>();
		hm.put("Gopi", 20);
		hm.put("Gopi", 21);
		hm.put("Bhaskar", 23);
		hm.put("Tiru", 22);
		hm.put("Naveen", 21);
		hm.put("Madhu", 26);
		
	}
}

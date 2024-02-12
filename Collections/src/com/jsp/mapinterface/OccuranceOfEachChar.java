package com.jsp.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachChar {
	public static void main(String[] args) {
		Map<Character, String> hm = new HashMap<>();
		String s="misisippi", temp="";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(!temp.contains(c+"")) {
				hm.put(c, temp);
			}
		}
	}
}

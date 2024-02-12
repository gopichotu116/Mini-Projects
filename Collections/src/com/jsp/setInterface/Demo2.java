package com.jsp.setInterface;

import java.util.*;
public class Demo2 
{
	public static void main(String[] args) 
	{
		SortedSet s=new TreeSet();
		s.add("Ram");
		s.add("Gopi");
		s.add("Vishal");
		s.add("Vishal");
		s.add("Raveesh");
		s.add("Joy");
		s.add("Raveesh");
		s.add("Aravind");
		System.out.println(s);
		for(Object o:s) {
			System.out.println(o);
		}
		System.out.println();
		SortedSet s1=s.headSet("Gopi");
		System.out.println(s1);
		
		System.out.println(s.tailSet("Joy"));
		
		System.out.println(s.subSet("Gopi", "ram"));
		
		
	}

}

 package com.jsp.setInterface;

import java.util.*;

public class LinkedHashSetDemo
{
	public static void main(String[] args)
	{
		Set s=new LinkedHashSet();
		s.add("Gopi");
		s.add("Ram");
		s.add("Vishal");
		s.add("Vishal");
		s.add("Joy");
		s.add("Raveesh");
		s.add("Raveesh");
		s.add("Aravind");
		System.out.println(s);
		for(Object o:s) {
			System.out.println(o);
		}
		System.out.println("Size="+s.size());
	}

}

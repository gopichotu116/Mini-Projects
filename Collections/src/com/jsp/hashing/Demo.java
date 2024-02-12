package com.jsp.hashing;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo 
{
	public static void main(String[] args)
	{
		Set s=new Set();
		Queue p = new PriorityQueue<>();
		s.add(10);
		s.add(10);
		s.add(30);
		s.add(30);
		s.add(50);		
		s.add(50);		
		s.add(20);		
		s.add(20);		
		s.add(80);	
		s.add(80);	
		System.out.println(s);
		s.remove(10);
		System.out.println(s);
		s.remove(80);
		System.out.println(s);
		
	}

}

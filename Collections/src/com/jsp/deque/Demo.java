package com.jsp.deque;

import java.util.*;
public class Demo 
{
	public static void main(String[] args) 
	{
		Deque d=new LinkedList();
		d.addFirst(20);
		d.addLast(10);
		for(Object o:d) {
			System.out.println(o);
		}
	}

}

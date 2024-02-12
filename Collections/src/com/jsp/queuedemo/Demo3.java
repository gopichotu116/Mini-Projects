package com.jsp.queuedemo;

import java.util.*;
import java.util.Queue;
public class Demo3 
{
	public static void main(String[] args) 
	{
		Queue q=new PriorityQueue<>();
		q.add(20);
		q.add(10);
		q.add(40);
		q.add(30);
		q.add(50);
		System.out.println(q);
		while(!q.isEmpty()) {
			System.out.print(q.poll()+" ");
		}
		System.out.println("\n"+q);
	}

}

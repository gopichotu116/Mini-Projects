package com.jsp.queuedemo;

public class Demo 
{
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.size());
		System.out.println(q.peek());
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}

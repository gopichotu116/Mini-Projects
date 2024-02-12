package com.jsp.queuedemo;

public class Demo2 
{
	public static void main(String[] args) {
		Queue2 q = new Queue2();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.size());
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println(q);
	}
}

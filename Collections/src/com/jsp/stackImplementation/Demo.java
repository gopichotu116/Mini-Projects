package com.jsp.stackImplementation;

public class Demo 
{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println(s.search(10));
		System.out.println(s);
		System.out.println("Size="+s.size());
		System.out.println(s.peekFirst());
		System.out.println(s.popFirst());
		System.out.println(s);
		System.out.println("Size="+s.size());
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println(s);
		System.out.println("Size="+s.size());
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
	}

}

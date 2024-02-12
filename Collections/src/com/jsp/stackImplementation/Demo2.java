package com.jsp.stackImplementation;

public class Demo2 
{
	public static void main(String[] args) 
	{
		Stack2 s = new Stack2();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.search(20));
		System.out.println(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.search(20));
		
		System.out.println(s);
		
//		System.out.println(s);
//		System.out.println(s.size());
//		System.out.println(s.isEmpty());
//		while(!s.isEmpty()) {
//			System.out.println(s.pop());
//		}
//		System.out.println(s);
//		System.out.println(s.size());
//		System.out.println(s.isEmpty());
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		System.out.println(s);
//		System.out.println(s.size());
		
	}

}

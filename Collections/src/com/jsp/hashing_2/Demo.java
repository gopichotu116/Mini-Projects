package com.jsp.hashing_2;

public class Demo 
{
	public static void main(String[] args)
	{
		Student s1=new Student("Gopi",69);
		Student s2=new Student("Ram",79);
		Student s3=new Student("Prasad",90);
		Student s4=new Student("Lashman",89);
		Student s5=new Student("Prasad",90);
		Student s6=new Student("Ari",96);
		Set s=new Set();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.display();
		System.out.println("Gopi".hashCode());
		System.out.println("Ram".hashCode());
		System.out.println("Prasad".hashCode());
		System.out.println("Lakshman".hashCode());
		System.out.println("Ari".hashCode());
		System.out.println("size="+s.size());
	}

}

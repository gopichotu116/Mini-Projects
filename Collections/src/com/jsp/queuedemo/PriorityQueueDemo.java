package com.jsp.queuedemo;

import java.util.PriorityQueue;

class Student  {
	Integer id;
	String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class PriorityQueueDemo{
	public static void main(String[] args) {
	    
		PriorityQueue<Student> pq = new PriorityQueue<Student>(new IdCompartor());
		 pq.add(new Student(11,"Das"));
	     pq.add(new Student(2,"Gopi"));
	     pq.add(new Student(3,"Boss"));
	     pq.add(new Student(41,"Tiru"));
	     pq.forEach(System.out::println);
	}

	
}

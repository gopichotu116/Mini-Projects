package com.jsp.hashing_2;

public class Student 
{
	String name;
	int marks;
	
	public Student(String n, int m) {
		name = n;
		marks = m;
	}
	
	public boolean equals(Student s) {
//		Student s=(Student)obj;
		return name.equals(s.name) &&
				marks==s.marks;
	}

	@Override
	public int hashCode() {
		return Math.abs(name.hashCode());
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
}

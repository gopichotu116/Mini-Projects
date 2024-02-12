package com.jsp.comparable;

public class Student implements Comparable<Student>
{
	String name;
	int id;
	int age;
	
	public Student(String name,int id,int age) {
		this.name=name;
		this.age= age;
		this.id= id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student s) {
		return id-s.id;
/*		Descending order
		if(this.age<s.age) return 1;
		if(this.age>s.age) return -1;
		return 0;
*/
		
/*		Ascending order
		if(this.age>s.age) return 1;
		if(this.age<s.age) return -1;
		return 0;
*/
		// String compare
		// return this.name.compareTo(s.name);
	}
	
	
}








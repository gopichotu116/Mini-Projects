package com.jsp.compareTo;

public class Student 
{
	private String name;
	private int id;
	private int age;
	
	public Student(String name,int id,int age) {
		this.name=name;
		this.age= age;
		this.id= id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
}

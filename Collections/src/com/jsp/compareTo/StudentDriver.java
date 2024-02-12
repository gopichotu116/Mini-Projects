package com.jsp.compareTo;

import java.util.*;

class Helper implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getId()-o2.getId();
	}
	
}

public class StudentDriver 
{
	public static void main(String[] args) 
	{
		Student[]s= {new Student("Gopi", 103, 20),
			     new Student("Bhaskar", 102, 23),
			     new Student("Sai", 101, 21),
			     new Student("Timma", 106, 19),
			     new Student("Honey", 104, 22),
			     new Student("Sravani", 105, 20)};
		System.out.println("Before Sorting");
		for(Student str:s) {
			System.out.println(str);
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Age sorting");
		Arrays.sort(s,new AgeComparator());
		for(Student str:s) {
			System.out.println(str);
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Name sorting");
		Arrays.sort(s,new NameComparator());
		for(Student str:s) {
			System.out.println(str);
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Id sorting");
		Arrays.sort(s,new Helper());
		for(Student str:s) {
			System.out.println(str);
		}
		
	}

}

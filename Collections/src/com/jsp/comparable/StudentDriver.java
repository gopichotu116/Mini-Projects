package com.jsp.comparable;

import java.util.Arrays;

public class StudentDriver
{
	public static void main(String[] args) {
		Student[]s= {new Student("Gopi", 103, 20),
				     new Student("Bhaskar", 102, 23),
				     new Student("Sai", 101, 21),
				     new Student("Timma", 106, 19),
				     new Student("Honey", 104, 22),
				     new Student("Sravani", 105, 20)};
		Arrays.sort(s);
		for(Student st:s) {
			System.out.println(st);
		}
	}

}

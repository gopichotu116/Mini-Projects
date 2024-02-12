package com.jsp.comparable;

import java.util.Arrays;

public class Circle_Demo 
{
	public static void main(String[] args) {
		Circle[]c= {new Circle(10),
				    new Circle(5),
				    new Circle(20),
				    new Circle(15),
				    new Circle(7)};
		Arrays.sort(c);
		for(Circle cir:c) {
			System.out.println(cir);
		}
	}

}

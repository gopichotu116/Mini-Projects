package com.jsp.comparable;

public class Circle implements Comparable<Circle>
{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle[radius="+radius+"]";
	}

	@Override
	public int compareTo(Circle c) {
		return this.radius-c.radius;
	}
	
}

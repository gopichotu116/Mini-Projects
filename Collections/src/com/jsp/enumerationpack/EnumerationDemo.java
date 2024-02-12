package com.jsp.enumerationpack;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

// used for iterating the elements of legacy class
// eg:- HashTable,Stack,Vector,Dictionary,Properties
public class EnumerationDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("--------------------------------");
		
		Stack<Integer> s = new Stack<>();
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		Enumeration<Integer> e1 = s.elements();
		while(e1.hasMoreElements()) {
				System.out.println(e1.nextElement());
		}
		System.out.println("----------------------------------------------");
		
		Hashtable<String, Integer> ages = new Hashtable<>();
		ages.put("Gopichand", 20);
		ages.put("Bhaskar", 23);
		ages.put("Ravindra", 21);
		ages.put("Narayan", 25);
		Enumeration<Integer> ele = ages.elements();
		// returns values not keys
		while(ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
		System.out.println("----------------------------------------------");
		
		Properties pro= new Properties();
		pro.setProperty("India", "+91");
		pro.setProperty("USA", "+21");
		pro.setProperty("UK", "+31");
		pro.setProperty("Japan", "+45");
		Enumeration<Object> ele1 = pro.elements();
		while(ele1.hasMoreElements()) {
			System.out.println(ele1.nextElement());
		}
		
//		Iterator<Integer> asitr = ages.elements().asIterator();
//		while(asitr.hasNext())
//			System.out.println(asitr.next());
	}
}

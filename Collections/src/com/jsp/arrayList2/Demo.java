package com.jsp.arrayList2;

import java.io.Serializable;
import java.util.*;

class A{
	
}
public class Demo extends A implements Serializable,RandomAccess
{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10);
		a.add(10);
		a.add(120);
		a.remove(a);
		System.out.println(a);
		System.out.println(a.indexOf(50));
		System.out.println(a.contains(30));
		a.ensureCapacity(0);
		Iterator i=a.iterator();
	}
}

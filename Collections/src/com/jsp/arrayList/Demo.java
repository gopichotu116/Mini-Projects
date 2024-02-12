package com.jsp.arrayList;

public class Demo 
{
	/** alt+shift+j
	 * 
	 */
	public static void main(String[] arge) 
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(10);
		a.add(20);
		a.add(20);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		a.reverse();
		System.out.println(a);
	}

}

package com.jsp.arrayList;

public class Demo_2 
{
	public static void main(String[] args) 
	{
		ArrayList_2<Integer> a = new ArrayList_2<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(2, 70);
		a.add(4,80);
//		a.set(3, 101);
//		a.addFirst(90);
//		a.addLast(100);
		System.out.println(a);
//		System.out.println(a.getFirst());
//		System.out.println(a.getLast());
//		
		a.reverse();
		System.out.println(a);
		ArrayList_2<String> a1 = new ArrayList_2<String>();
		a1.add("Gopi");
		a1.add("Bhaskar");
		a1.add("Sai");
		a1.add("Deva");
		a1.add("MaheshBabu");
		System.out.println(a1);
		a1.reverse();
		System.out.println(a1);
	}

}

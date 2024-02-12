package com.jsp.comparable;

import java.util.*;

public class BubbleSort
{
	public static void main(String[] args)
	{
		String []a= {"Gopichand","Rakesh","RAvi","Arun","amulya"};
		
		sort(a);
		for(String str:a) {
			System.out.println(str);
		}
	}
	
	public static void sort(String []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}

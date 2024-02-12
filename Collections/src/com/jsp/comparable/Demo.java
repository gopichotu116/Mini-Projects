package com.jsp.comparable;

public class Demo 
{
	public static void main(String[] args) 
	{
//        Object []a= {"Gopichand","Rakesh","RAvi","Arun","amulya"};
//        Object []a= {3,5,7,2,9,1,4,6};
//        Object []a= {true,false ,false,true};
        Object []a= {'a','I','E','U','o'};
		sort(a);
		for(Object str:a) {
			System.out.println(str);
		}
	}
	
	public static void sort(Object []a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
			Comparable c1=(Comparable) a[j];
			Comparable c2=(Comparable) a[j+1];
			if(c1.compareTo(c2)>0) {
				Object temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
	}

}

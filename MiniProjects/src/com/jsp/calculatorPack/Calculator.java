package com.jsp.calculatorPack;

import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Welcome to smart Calci:");
		while(true)
		{
			System.out.println(
					 "1.Addition"
					+ "\n2.Substraction"
					+ "\n3.Mutiplecation"
					+ "\n4.Division"
					+ "\n5.Reminder value"
					+ "\n6.power of a Number"
					+ "\nEnter your choice:");
			int choice=scn.nextInt();
			System.out.println("Enter two values");
			int a=scn.nextInt();
			int b=scn.nextInt();
//			 c,d=100;
			int add,multi,sub,div,rem=0;
			switch(choice)
			{
			case 1:
				 add=a+b;
				System.out.println(a+"+"+b+"="+add);
				break;
			case 2:
				 sub=a-b;
				System.out.println(a+"-"+b+"="+sub);
				break;
			case 3:
				 multi=a*b;
				System.out.println(a+"*"+b+"="+multi);
				break;
			case 4:
				for(;;)
				{
					if(a<b)
					{
						System.out.println("a value should be greater than b");
					}
					else
					{
						div=a/b;
						System.out.println(a+"/"+b+"="+div);
					}
					break;
				}
				break;
			case 5:
				rem=a%b;
				System.out.println(a+"%"+b+"="+rem);
				break;
			case 6:
				int res=1;
				for(int i=1;i<=b;i++)
				{
					res=res*a;
				}
				System.out.println(a+"^"+b+"="+res);
				break;
				default:
					System.out.println("Invalid choice....!");
					break;
			}
		}
		
	}

}

package com.jsp.numPrograms;

import java.util.Scanner;

public class MenuDrivenProgram
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Welcome to MenuDriven Program");
		while(true)
		{
			System.out.println("\nchoose your option:"
					+ "\n1.Prime Number"
					+ "\n2.Factorial"
					+ "\n3.Power"
					+ "\n4.Length"
					+ "\n5.Reverse of a number "
					+ "\n6.Armstrong number"
					+ "\n7.Strong number"
					+ "\n8.Automorphic"
					+ "\n9.Niven Number"
					+ "\n10.Armstrong range"
					+ "\n11.Strong range"
					+ "\n12.Automorphic range"
					+ "\n13.Niven number range"
					+ "\n14.Palindrome number"
					+ "\n15.Palindrome range"
					+ "\n16.Exit");
			int choice=scn.nextInt();
			int n,res,a,b;
			switch(choice)
			{
			case 1:
				System.out.println("Prime number or not");
				System.out.print("Enter the number:");
				n=scn.nextInt();
				if(n<0) System.out.println("No negatives");
				else 
				{
					res=Utility.prime(n);
					if(res==2) System.out.println("Is prime");
					else System.out.println("Not prime");
				}
				break;
			case 2:
				System.out.println("Factorial of a number");
				System.out.println("Enter the number:");
				 n=scn.nextInt();
				if(n<0) System.out.println("No negatives");
				else 
				{
					res=Utility.factorial(n);
					System.out.println(n+"!="+res);
				}
				break;
			case 3:
				System.out.println("Power of a number");
				System.out.println("Enter base value");
				 a=scn.nextInt();
				System.out.println("Enter exp value");
				 b=scn.nextInt();
				if(a<0 || b<0) System.out.println("No negatives");
				else 
				{
					res=Utility.power(a, b);
					System.out.println(a+"^"+b+"="+res);
				}
				break;
			case 4:
				System.out.println("Length of number");
				System.out.println("Enter the number:");
				n=scn.nextInt();
				if(n<0) System.out.println("No negatives");
				else 
				{
					res=Utility.length(n);
					System.out.println("Length="+res);
				}
				break;
			case 5:
				System.out.println("Reverse of a number");
				System.out.println("Enter the number");
				n=scn.nextInt();
				if(n<0) System.out.println("No negatives");
				else 
				{
					res=Utility.rev(n);
					System.out.println("Reverse num="+res);
				}
				break;
			case 6:
				System.out.println("Armstrong number or not");
				System.out.println("Enter the number");
				n=scn.nextInt();
				if(n<0) System.out.println("No negatives");
				else 
				{
					res=Utility.armStrong(n);
					if(res==n) System.out.println("Is Armstrong");
					else System.out.println("Not armstrong");
				}
				break;
			case 7:
				System.out.println("Strong number or not");
				System.out.println("Enter the number");
				n=scn.nextInt();
				if(n<0) System.out.println("No negatives");
				else
				{
					res=Utility.strong(n);
					if(res==n) System.out.println("Is Strong");
					else System.out.println("Not strong");
				}
				break;
			case 8:
				System.out.println("Automorphic number or not");
				System.out.println("Enter the number");
				n=scn.nextInt();
				if(n<0) System.out.println("No negatives");
				else 
				{
					res=Utility.automorphic(n);
					if(res==n) System.out.println("Is automorphic");
					else System.out.println("Not automorphic");
				}
				break;
			case 9:
				System.out.println("Niven number or not");
				System.out.println("Enter the number");
				n=scn.nextInt();
				if(n<0) System.out.println("No negatives");
				else 
				{
					res=Utility.niven(n);
					if(n%res==0) System.out.println("Is Niven nubmer");
					else System.out.println("Not niven");
				}
				break;
			case 10:
				System.out.println("Range of Armstrong:");
				System.out.println("Enter lower limit");
				 a=scn.nextInt();
				System.out.println("Enter upper limit");
				 b=scn.nextInt();
				 for(int i=a;i<=b;i++)
					 if(i==Utility.armStrong(i))
						 System.out.print(i+" ");
				 break;
			case 11:
				System.out.println("Range of Strong:");
				System.out.println("Enter lower limit");
				 a=scn.nextInt();
				System.out.println("Enter upper limit");
				 b=scn.nextInt();
				 for(int i=a;i<=b;i++)
					 if(i==Utility.strong(i))
						 System.out.print(i+" ");
				 break;
			case 12:
				System.out.println("Range of Automorphic:");
				System.out.println("Enter lower limit");
				 a=scn.nextInt();
				System.out.println("Enter upper limit");
				 b=scn.nextInt();
				 for(int i=a;i<=b;i++)
					 if(i==Utility.automorphic(i))
						 System.out.println(i);
				 break;
			case 13:
				System.out.println("Range of Niven number:");
				System.out.println("Enter lower limit");
				 a=scn.nextInt();
				System.out.println("Enter upper limit");
				 b=scn.nextInt();
				 for(int i=a;i<=b;i++)
				 if(i==Utility.niven(i))
				 System.out.println(i);
				 break;
			case 14:
				System.out.println("Palindrome or not");
				n=scn.nextInt();
				if(n==Utility.rev(n))
				System.out.println("Is palindrome");
				else System.out.println("is not palindrome");
				break;
			case 15:
				System.out.println("Palindrome Range");
				System.out.println("Enter Upper limit");
				a=scn.nextInt();
				System.out.println("Enter lower limit");
				b=scn.nextInt();
				for(int i=a;i<=b;i++)
			    if(i==Utility.rev(i))
				System.out.println(i);
				break;
			case 16:
				System.out.println("Thanks for using the Calci\nVisit again Have a good day");
				break;
				
				default:
					System.out.println("Invalid choice..!");
			}
		}
	}

}

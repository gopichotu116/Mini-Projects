package com.jsp.numPrograms;

public class Utility 
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static int length(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	public static int rev(int n)
	{
		int rem=0,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
	public static int power(int a,int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		return pow;
	}
	public static int armStrong(int n)
	{
		int res=0,rem=0,temp=n;
		int len=length(n);
		while(n>0)
		{
			rem=n%10;
			res+=power(rem,len);
			n/=10;
		}
		return res;
	}
	public static int strong(int n)
	{
		int rem=0,res=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			res+=factorial(rem);
			n/=10;
		}
		return res;
	}
	public static int prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}
	public static int automorphic(int n)
	{
		int squr=n*n,res=0,temp=n;
		res=squr%power(10,length(n));
		return res;
	}
	public static int niven(int n)
	{
		int rem=0,temp=n,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
}

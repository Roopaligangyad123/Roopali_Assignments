package com.cg.problems;

public class Problem2
{
	public static void main (String [] args)
	{
		for(int k=100;k<1000;k++)
		{
			int n=k;
			int d=0;
			int sum=0;

			while(n>0) {
				d=n%10;
				sum=sum+(d*d*d);
				n=n/10;
			}
			if(sum == k)
			{
				System.out.println(k + " is a Armstrong number");
			}
		}

	} 
} 
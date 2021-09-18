package com.daily.practise;

import java.util.Scanner;

public class PrimeNoRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no you want to start");
		int start = sc.nextInt();
		System.out.println("Enter no you want to End");
		int end = sc.nextInt();
		System.out.println("List of prime number between "+ start +" and "+end);
		for(int i=start;i<end;i++)
		{
			int Count=0;
			if(isPrime(i))
			{
				System.out.println(i);
				Count++;
			}

		}

	}

	public static boolean isPrime(int n)
	{

		if(n<=1)
		{
			return false;
		}

		else
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
				return false;
				}
			}
		}
		 return true;


	}

}

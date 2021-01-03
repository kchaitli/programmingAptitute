package com.xworkz.alphabets;

import java.util.Scanner;

public class A {
	public static void main(String[] args)
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n = SC.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1&&j!=1&&j!=n || j==n&&i!=1 || j==1&&i!=1|| i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

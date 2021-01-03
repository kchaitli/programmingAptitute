package com.xworkz.alphabets;

import java.util.Scanner;

public class LetterC {
	public static void main(String[] args)
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the size of n:");
		int n = SC.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1&&j!=1|| i==n&&j!=1 || j==1&&(i!=n&&i!=1))
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

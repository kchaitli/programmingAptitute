package com.xworkz.alphabets;

import java.util.*;

public class LetterE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1|| i==n/2|| i==n|| j==1)
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

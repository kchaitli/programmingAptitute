package com.xworkz.alphabets;

import java.util.*;

public class LetterU {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n&&(j!=1&&j!=n)||j==1&&i!=n||j==n&&i!=n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

package com.xworkz.alphabets;

import java.util.*;

public class LetterN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

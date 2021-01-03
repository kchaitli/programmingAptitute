package com.xworkz.alphabets;

import java.util.*;

public class LetterK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j&&j>5||i+j==n+1&&i<=5||j==4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

package com.xworkz.alphabets;

import java.util.Scanner;

public class LetterX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = scan.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==j||i+j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

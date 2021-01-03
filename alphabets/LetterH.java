package com.xworkz.alphabets;

import java.util.Scanner;

public class LetterH {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n value:");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n/2||j==1||j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

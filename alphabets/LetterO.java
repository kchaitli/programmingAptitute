package com.xworkz.alphabets;

import java.util.*;

public class LetterO {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n= scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&(j!=1&&j!=n)||i==n&&(j!=1&&j!=n)||j==1&&(i!=1&&i!=n)||j==n&&(i!=1&&i!=n)) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

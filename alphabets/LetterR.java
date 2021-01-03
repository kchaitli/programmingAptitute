package com.xworkz.alphabets;

import java.util.*;

public class LetterR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value for n: ");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&(j!=1&&j!=n)||j==1&&(i!=1)||j==n&&i<=n/2&&(i!=1&&i!=n/2)||i==n/2&&(j!=n)||(n/2+j)==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

package com.xworkz.generalApti;

import java.util.Scanner;

public class PrimeNumUsingWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a whole number:");
		int number= scan.nextInt();
		int i=2;
		int count=0;
		
		while(i<=number/2) {
			if(number%i==0) {
				count++;
				break;
			}
			i++;
		}
		System.out.println("number of iterations "+i);
		if(count==0) {
			System.out.println("the number is prime");
		}else {
			System.out.println("the number is not prime");
		}
	}

}

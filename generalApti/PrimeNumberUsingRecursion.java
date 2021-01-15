package com.xworkz.generalApti;

import java.util.Scanner;

public class PrimeNumberUsingRecursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scan.nextInt();
		System.out.println(number);
		boolean prime = false;
		if(number>1) {
			prime= primeNumber(number,2);
			if(prime==false) {
				System.out.println("Number is not prime");
			}else {
				System.out.println("Number is prime");
			}
		}
		else {
			System.out.println("please add a number greater than 1");
		}
	}
	static boolean primeNumber(int number, int i) {
		if(number>i) {
			if(number%i==0) {
				return false;
			}else {
				return primeNumber(number, ++i);
			}
		}
		return true;
	}

}

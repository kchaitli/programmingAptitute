package com.xworkz.generalApti;

import java.util.Scanner;

public class Palindrome {
	
	public void palindrome() {
	
	Scanner scan = new Scanner(System.in);
	
	int sum=0;
	System.out.println("enter number to be checked");
	int n = scan.nextInt();
	int r,temp;
	
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
		System.out.println("palindrome number");
	else
		System.out.println("not palindrome");
	}
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.palindrome();
	}

}

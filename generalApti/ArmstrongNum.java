package com.xworkz.generalApti;

import java.util.Scanner;

public class ArmstrongNum {

	public void armstrongNumber() {
		Scanner scan = new Scanner(System.in);
		int c = 0, a, temp;
		System.out.println("enter the number to be checked");
		int n = scan.nextInt();
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");
	}

	public static void main(String[] args) {
		ArmstrongNum armstrongNum = new ArmstrongNum();
		armstrongNum .armstrongNumber();
	}

}

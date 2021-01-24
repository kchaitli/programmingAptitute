package com.xworkz.generalApti;

public class StringPalindromeTester {

	public static void main(String[] args) {
		String str ="bob";
		
		StringPalindrome palindrome = new StringPalindrome();
		if(palindrome.isPalindrome(str))
			System.out.println("yes "+str+ " is palindrome");
		else
			System.out.println("no "+str+ " is not palindrome");
		
	}

}

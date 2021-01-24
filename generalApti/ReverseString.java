package com.xworkz.stringExcecution;

public class ReverseString {
	
	public String reverseString(String str) {
		
		char name[] = str.toCharArray();
		String rev="";
		
		for(int i=name.length-1;i>=0;i--) {
			rev= rev+name[i];
		}
		
		return rev;
	}
}

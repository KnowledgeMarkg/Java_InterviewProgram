package com.String.kodnest;

public class ConvertCaseOfAllAlphabetsInString {

	public static void main(String[] args) {
//		    Input:
//			Hello World!
//			Output:
//			hELLO wORLD!
		
		String str = "Hello World!";
		char[] ch = str.toCharArray();
		for(char chr : ch) {
			
			if(Character.isUpperCase(chr)) {
			System.out.print(Character.toLowerCase(chr));
			}
			else {
				System.out.print(Character.toUpperCase(chr));
			}
		}

	}

}

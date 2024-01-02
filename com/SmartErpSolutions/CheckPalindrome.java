package com.SmartErpSolutions;

public class CheckPalindrome {

	public static void main(String[] args) {
		String str = "mama";
		String revStr = revString(str);
		if(revStr.equals(str)) {
			System.out.println("Strings Are Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

	private static String revString(String str) {
		String st ="";
		for(int i= str.length()-1; i>=0; i--) {
			st+=str.charAt(i);
		}
		return st;
	}

}

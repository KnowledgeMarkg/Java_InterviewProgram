package com.String.kodnest;

public class PrintAllPalindromeInSubStringOfString {

	public static void main(String[] args) {
		String str = "abccbc";
		findSubString(str);
	}

	private static void findSubString(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				checkPalindrome(str.substring(i, j+1));
			}
		}
	}

	private static void checkPalindrome(String substring) {
		int left = 0; 
		int right = substring.length()-1;
		String s = new String();
		String temp = substring;
	     for(int i= right ; i>=left; i--) {
	    	 s+=substring.charAt(i);
	     }
    	 if(temp.equals(s)) {
 			System.out.println(substring);
 		}
	}

}

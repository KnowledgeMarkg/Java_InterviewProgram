package com.String.kodnest;

public class Print_All_Palindrome_In_SubString_Of_String {
	public static void main(String[] args) {
		String str = "abcc";
		findSubString(str);
	}
	private static void findSubString(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				if(isPalindrome(str.substring(i, j+1))) {
					System.out.println(str.substring(i, j+1));
				}
			}
		}
	}
	private static boolean isPalindrome(String substring) {
		int left =0;
		int right = substring.length()-1;
		while(left<=right) {
			if(substring.charAt(left)!=substring.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}

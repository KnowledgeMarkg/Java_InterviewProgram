package com.String.kodnest;

import java.util.Scanner;

/*Reduce a string of lowercase characters in range ascii[‘a’..’z’]
 * by doing a series of operations.
 In each operation, select a pair of adjacent letters that match, and delete them.
Delete as many characters as possible using this method and return the resulting string. 
If the final string is empty, return Empty String
Example.
s="aab";
aab shortens to b in one operation: remove the adjacent a characters.
s ="abba";
Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. 
Return 'Empty String'.*/

public class SuperReducedString {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A String");
			String str = sc.nextLine();
			superReduceString(str);
		}
	}
	private static void superReduceString(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i=1; i<sb.length(); i++) {
			if(sb.charAt(i)==sb.charAt(i-1)) {
				sb.delete(i-1, i+1);
				i=0;
			}
		}
		String ans = sb.toString();
		if(ans.length()==0) {
			System.out.println("Empty String");
		}else {
			System.out.println(ans);
		}
	}
}

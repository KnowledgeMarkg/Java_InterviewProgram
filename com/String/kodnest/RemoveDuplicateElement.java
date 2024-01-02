package com.String.kodnest;

import java.util.Scanner;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			String remDup = removeDuplicate(str);
			System.out.println(remDup);
		}
	}
	private static String removeDuplicate(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
				if(sb.indexOf(ch+"")<0) {
				sb.append(ch);
				}
		}
		return sb.toString();
	}
}

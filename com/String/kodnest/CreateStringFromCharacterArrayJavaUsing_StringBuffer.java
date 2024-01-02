package com.String.kodnest;

import java.util.Scanner;

public class CreateStringFromCharacterArrayJavaUsing_StringBuffer {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Size Of Elements ");
			int n = sc.nextInt();
			System.out.println("Enter The Element in the CharArr");
			char[] charArr = new char[n];
			for(int i=0; i<charArr.length; i++) {
				charArr[i] = sc.next().charAt(0);
			}
			
			String str = createStringToCharArray(charArr);
			System.out.println("Formated Output Is " +str);
		}
	}

	private static String createStringToCharArray(char[] charArr) {
		StringBuffer bf = new StringBuffer();
		for(char ch : charArr) {
			bf.append(ch);
		}
		return bf.toString();
	}

}

package com.assignment.sep;

import java.util.Scanner;

public class CheckVowelOrConsonent {
	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch=='a' || ch=='e' || ch =='i' || ch =='o' || ch == 'u';
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A Character ");
			char ch = sc.next().charAt(0);
			if(Character.isLowerCase(ch)) {
				if (isVowel(ch)) {
					System.out.println("Lower Case vowel " +ch);
				}else {
					System.out.println("Lower case consonant "+ch);
				}
			}else if (Character.isUpperCase(ch)) {
				if(isVowel(ch)) {
					System.out.println("Upper Case Vowel " +ch);
				}else {
					System.out.println("upper case Consonant "+ch);
				}
			}else if (Character.isDigit(ch)) {
				System.out.println("It is A Digit "+ch);
			}else {
				System.out.println("Special Character "+ch);
			}
		}
		
	}
}

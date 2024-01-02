package com.assignment.sep;

import java.util.Scanner;

public class Check_PalindromeNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A number To check, It is Palindrome or not");
			int num = scanner.nextInt();
			int rev = findReverse(num);
			if(rev==num) {
				System.out.println("The " + num + " is a Palindrome");
			}else {
				System.out.println("The " + num + " is not a Palindrome");
			}
			
		}
	}

	private static int findReverse(int num) {
		StringBuffer sBuffer = new StringBuffer();
		while(num>0) {
			int rem = num %10;
			sBuffer.append(rem);
			num/=10;
		}
		return Integer.parseInt(sBuffer.toString());
	}

}

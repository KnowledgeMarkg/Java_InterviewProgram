package com.assignment.sep;

import java.util.Scanner;

public class Find_The_Largest_Digit_In_A_Number {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A Number to Find it's largest Digit");
			int num = scanner.nextInt();
			int digit = findLargestDigit(num);
			System.out.println("The Largest Of Digit of "+num +" is " +digit);
		}
	}

	private static int findLargestDigit(int num) {
		int large = Integer.MIN_VALUE;
		while(num>0) {
			int rem = num%10;
			if(rem > large) {
				large = rem;
			}
			num/=10;
		}
		return large;
	}

}

package com.assignment.sep;

import java.util.Scanner;

public class Calculate_The_Sum_Of_Digits_Of_Number {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A Number To find Sum OF it's Digit");
			int num = scanner.nextInt();
			int sum = finSumOfDigit(num);
			System.out.println("Sum of Digit of "+num +" is "+sum);
		}
	}

	private static int finSumOfDigit(int num) {
		int sum =0;
		while(num>0) {
			int rem = num %10;
			sum +=rem;
			num/=10;
		}
		return sum;
	}

}

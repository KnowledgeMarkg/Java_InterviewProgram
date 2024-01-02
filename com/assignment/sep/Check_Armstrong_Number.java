package com.assignment.sep;

import java.util.Scanner;

public class Check_Armstrong_Number {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A number to check armstrong");
			int num = scanner.nextInt();
			int digit = findNoDigit(num);
			checkArmstrongNum(num, digit);
		}
	}

	private static void checkArmstrongNum(int num, int digit) {
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			sum += Math.pow(rem, digit);
			num /= 10;
		}
		if (temp == sum) {
			System.out.println("Sum of Digit Of " + temp + " is " + sum +" so it is Armstrong Number");
		}else {
			System.out.println("Sum of Digit Of " + temp + " is " + sum +" Both are not same ,  so it is Armstrong Number");
		}
	}

	private static int findNoDigit(int num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

}

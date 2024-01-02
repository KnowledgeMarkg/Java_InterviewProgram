package com.assignment.sep;

import java.util.Scanner;

public class Print_The_First_N_Prime_Numbers {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A number");
			int n = scanner.nextInt();
			System.out.println("First " + n + " Prime number are : ");
			printPrimeNumber(n);
		}
	}

	private static void printPrimeNumber(int n) {
		int count = 0;
        int num = 2;  // Starting from the first prime number

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <=Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
		
	}
}

package com.Kodnest.A4.July;

import java.util.Scanner;

public class GalacticAddition {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			long num1 = scanner.nextLong();
			long num2 = scanner.nextLong();
			long sum = galacticAddition(num1, num2);
			System.out.println(sum);
		}
	}

	private static long galacticAddition(long num1, long num2) {
		long sum = num1+num2;
		return sum;
	}

}

package com.assignment.sep;

import java.util.Scanner;

public class Sum_OfSquares_Of_N_Natural_Number {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter The Value Of N");
			int n = scanner.nextInt();
			int sqra = squOfNNumber(n);
			System.out.println(sqra);
		}
	}

	private static int squOfNNumber(int n) {
		int sqrt = (n*(n+1)*(2*n+1))/6;
		return sqrt;
	}

}

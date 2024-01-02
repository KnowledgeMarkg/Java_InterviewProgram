package com.AgiraTech;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A Number");
			int num = sc.nextInt();
			int sum = findSumDigit(num);
			System.out.println(sum);
		}
	}

	private static int findSumDigit(int num) {
		int sum =0;
		while(num>0) {
			int rem = num %10;
			sum+=rem;
			num/=10;
		}
		return sum;
	}

}

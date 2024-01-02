package com.AgiraTech;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A Number To Find Factorial ");
			int num  = sc.nextInt();
			int fact = FactorialNum(num);
			System.out.println(fact);
		}
	}

	private static int FactorialNum(int num) {
		int sum =1;
		for(int i=2 ;i<=num ; i++) {
			sum *= i;
		}
		return sum;
	}

}

package com.assignment.sep;

import java.util.Scanner;

public class Fibonacci_Series_Up_To_N_Terms {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A Number ");
			int n = scanner.nextInt();
			int num1 =0, num2=1;
			System.out.print(num1);
			System.out.print(","+num2);
			for(int i =1; i<=n-2 ; i++) {
				int nextNum = num1+num2;
				num1 = num2;
				num2 = nextNum;
				System.out.print(","+nextNum);
				//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
			}
		}
	}

}

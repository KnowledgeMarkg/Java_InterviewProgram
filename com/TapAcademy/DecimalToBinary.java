package com.TapAcademy;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A Number To Change Decimal To Binary");
			int n = sc.nextInt();
			convertDecimalToBinary(n);
		}
	}

	private static void convertDecimalToBinary(int n) {
		String b ="";
		while(n>=1) {
			int rem = n % 2;
			b = rem+" " +b;
			n/=2;
		}
		System.out.println(b);
	}

}

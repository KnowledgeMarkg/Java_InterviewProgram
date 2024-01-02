package com.NoramalQuestions;

import java.util.Scanner;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int gcd =findGCD(num1, num2);
			System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);
			int lcm = findLCM(num1, num2, gcd);
			System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
		}
	}

	private static int findLCM(int num1, int num2, int gcd) {
		int lcm = (num1*num2)/gcd;
		return lcm;
	}

	private static int findGCD(int num1, int num2) {
		while(num2 !=0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}

}

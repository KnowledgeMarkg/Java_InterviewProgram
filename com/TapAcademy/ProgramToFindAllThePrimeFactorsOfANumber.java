package com.TapAcademy;

import java.util.Scanner;

public class ProgramToFindAllThePrimeFactorsOfANumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			findPrimeFactor(num);
		}
	}

	private static void findPrimeFactor(int num) {
		int i=2;
		while(i*i<=num) {
			while(num % i ==0) {
				System.out.print(i+", ");
				num = num/i;
			}
			i++;
		}
		if(num>1) {
			System.out.println(num);
		}
	}

}

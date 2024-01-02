package com.TapAcademy;

import java.util.Scanner;
public class ProgramToPrintAllTheDivisorsOfAGivenNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			findAllDivisor(n);
		}
	}
	private static void findAllDivisor(int n) {
		    int i;
		    for (i = 1; i <= Math.sqrt(n); i++) {
		        if (n % i == 0) {
		            System.out.println(i);
		        }
		    }
		    for (i--; i >= 1; i--) {
		    System.out.println(i);
		        if (n % i == 0 && i != n / i) {
		            System.out.println(n / i);
		        }
		    }
		}

	}

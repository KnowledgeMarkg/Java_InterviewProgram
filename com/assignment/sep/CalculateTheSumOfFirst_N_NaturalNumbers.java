package com.assignment.sep;

import java.util.Scanner;

public class CalculateTheSumOfFirst_N_NaturalNumbers {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A Number ");
			int n = scanner.nextInt();
			int sum =0;
			for(int i=1; i<=n; i++) {
				sum+=i;
			}
//			sum = n*(n+1)/2; formula 
			System.out.println(sum);
		}	
	}

}

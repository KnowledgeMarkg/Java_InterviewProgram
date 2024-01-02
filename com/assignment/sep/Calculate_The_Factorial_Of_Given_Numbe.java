package com.assignment.sep;

import java.util.Scanner;

public class Calculate_The_Factorial_Of_Given_Numbe {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A Number To Find Factorials");
			int n = scanner.nextInt();
			int mul =1;
			for(int i=n; i>0 ;i--) {
				mul*=i;
			}
			System.out.println(mul);
		}
		
	}

}

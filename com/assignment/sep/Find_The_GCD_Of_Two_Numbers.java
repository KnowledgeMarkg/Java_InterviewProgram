package com.assignment.sep;
import java.util.Scanner;
public class Find_The_GCD_Of_Two_Numbers {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the first number: ");
			int num1 = scanner.nextInt();
			System.out.print("Enter the second number: ");
			int num2 = scanner.nextInt();
            int a = findHCF(num1, num2);
            System.out.println("The HCF OF " +num1 +" And " +num2 +" is "+a);
		}
	}

	private static int findHCF(int num1, int num2) {
		int min = Math.min(num1, num2);
		int hcf =1;
		for(int i=2; i<=min ;i++) {
			if(num1 % i ==0 && num2 % i==0) {
				hcf = i;
			}
		}
		return hcf;
	}

}

package com.Assignmnet.July.A4;

import java.util.Scanner;

public class HalfTheNumber {

	public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
    	   System.out.println("Enter The Number for Halve This Number");
    	   double num = scanner.nextDouble();
    	   double halveNumber = halveTheNumbe(num);
    	   System.out.println("The Halve of this "+num +" is : "+halveNumber);
     	}
	}

	private static double halveTheNumbe(double num) {
		double halve = num/2;
		return halve;
	}

}

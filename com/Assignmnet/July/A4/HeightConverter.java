package com.Assignmnet.July.A4;

import java.util.Scanner;

public class HeightConverter {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double inches = scanner.nextDouble();
			double feest=  doubdouconvertInchesToFeet(inches);
			System.out.println(inches +"= " +feest + " feets");
		}
	}

	private static double doubdouconvertInchesToFeet(double inches) {
		 double feet = inches/12;
		return feet;
	}

}

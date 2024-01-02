package com.Assignmnet.July.A4;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter The Minutes To Convert To Hours");
			int minutes = scanner.nextInt();
			double hours = convertToHours(minutes);
			 System.out.println(minutes+" Minutes "+" into Hours : "+hours);
		}
	}

	private static double convertToHours(int minutes) {
		 double hours = (double)minutes/60;
		return hours;
	}

}

package com.Assignmnet.July.A4;

import java.util.Scanner;

public class SpacecraftThrustControl {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			double d = calculateThrus(num);
			System.out.println(d);
		}
	}

	private static double calculateThrus(int num) {
		 double thrust = Math.pow(num, 5);
		return thrust;
	}

}

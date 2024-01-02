package com.Assignmnet.July.A4;

import java.util.Scanner;

public class CityPlanningSimulator {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			double num2 = scanner.nextDouble();
			calculatePlotArea(num);
			calculatePlotArea(num2);
		}
		
	}

	private static void calculatePlotArea(double num2) {
		double area = num2*num2;
		System.out.println("Area of Double Data Type Side : "+area);
	}

	private static void calculatePlotArea(int num) {
		int area = num*num;
		System.out.println("Area Of int Data Type Side : "+area);
		
	}

}

package com.Kodnest.A4.July;

import java.util.Scanner;

class CalculateDistanc{

	public void calculateDistance(double speed, double time) {
		double distance = speed*time;
		System.out.println(distance);
	}
	
}
public class TheJourneyCalculator {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter The Speed of Car");
			double speed = scanner.nextDouble();
			System.out.println("Enter the Time");
			double time = scanner.nextDouble();
			CalculateDistanc distanc = new CalculateDistanc();
			distanc.calculateDistance(speed, time);
		}
	}

}

package com.Kodnest.A4.July;

import java.util.Scanner;

public class ThePlanetExplorer {

	public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Radius To Find Surface Area");
			 double r = sc.nextDouble();
			 double area = calculateSurfaceArea(r);
			 System.out.println(area);
		}
	}

	private static double calculateSurfaceArea(double r) {
		 double area = 4*  (Math.PI)*(Math.pow(r, 2));
		return area;
	}

}

package com.Kodnest.A4.July;

public class TheTemperatureConverter {
     public static void main(String[] args) {
		double f = 68.0;
		double c =convertFahrenheitToCelsius(f);
		System.out.println(c);
	}

	private static double convertFahrenheitToCelsius(double f) {
		double c= (f - 32) * 5/9;
		return c;
	}
}

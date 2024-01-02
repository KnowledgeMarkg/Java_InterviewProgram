package com.Kodnest.A4.July;

import java.util.Scanner;

public class The_Double_Trouble {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter The Number For Doubling The Number");
			int num = scanner.nextInt();
			int doublenum = doubleTheNumber(num);
			System.out.println(num +" double is : "+doublenum);
		}
		}

	private static int doubleTheNumber(int num) {
	     int doublenum = num*2;
		return doublenum;
	}

}

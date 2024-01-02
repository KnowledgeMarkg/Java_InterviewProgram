package com.Kodnest.A4.July;

import java.util.Scanner;

public class TheStringJoine {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter The Name Which we want to join");
			String st = scanner.next();
			System.out.println("Enter Anothe Name Which we want to join");
			String string = scanner.next();
			String newName= joinStrings(st, string);
			System.out.println(newName);
		}
	}

	private static String joinStrings(String st, String string) {
		 String string2= String.join(",", st,string);
		return string2;
	}

}

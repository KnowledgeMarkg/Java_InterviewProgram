package com.Kodnest.A4.July;

import java.util.Scanner;
  class CheckEligiblityForVote{
	  public static void checkEligiblity(int age , String nation) {
		  if(nation.equals("indian")) {
			  if(age>=18) {
				  System.out.println("You Are Eligible for Vote");
			  }else {
				System.out.println("Focus on Study");
			}
		  }else {
			System.out.println("Your Nation Is Not India");
		}
	  }
  }

public class CheckEligiblityApp {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter The Nationality");
			String string = scanner.next();
			string = string.toLowerCase();
			System.out.println("Enter The Age");
			int age = scanner.nextInt();
			CheckEligiblityForVote.checkEligiblity(age, string);
		}
	}

}

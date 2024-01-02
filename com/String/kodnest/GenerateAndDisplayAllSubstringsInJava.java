package com.String.kodnest;

import java.util.Scanner;

public class GenerateAndDisplayAllSubstringsInJava {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = "abc";
			genrateAllSubString(str);
		}
	}

	private static void genrateAllSubString(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				System.out.println(str.substring(i,j+1));
			}
		}
	}

}

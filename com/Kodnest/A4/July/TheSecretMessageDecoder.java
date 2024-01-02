package com.Kodnest.A4.July;

import java.util.Scanner;

public class TheSecretMessageDecoder {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A Character");
			char ch = scanner.next().charAt(0);
			int num = decodeCharacter(ch);
			System.out.println(num);
		}
	}

	private static int decodeCharacter(char ch) {
		 int num = ch;
		return num;
	}

}

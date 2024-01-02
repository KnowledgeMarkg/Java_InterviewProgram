package com.AgiraTech;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A number To Find It's reversed");
			int num = sc.nextInt();
			findReversed(num);
		}
	}
	private static void findReversed(int num) {
		String st= "";
		int temp = num;
		while(num>0) {
			int rem = num % 10;
			st+=rem;
			num/=10;
		}
		System.out.println(temp +" Reversed Number " + st.toString());
	}
}

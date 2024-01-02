package com.TapAcademy;

import java.util.Scanner;

public class LengthOfConsecutive1sInTheBinaryRepresentation {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			decimalTobinary(num);
			int count = countConsecutive1(num);
			System.out.println(count);
		}
	}

	private static void decimalTobinary(int num) {
		String st = "";
		while(num>0) {
			int rem = num%2;
			num = num/2;
			st = rem+" " +st;
		}
		System.out.println(st);
	}

	private static int countConsecutive1(int num) {
		int count =0;
		while(num>0) {
			num = num & (num<<1);
			count++;
		}
		return count;
	}

}

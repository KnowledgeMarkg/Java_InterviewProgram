package com.TapAcademy;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A Binary To change in decimal");
			int n = sc.nextInt();
			changeBinaryToDecimal(n);
		}
	}
	private static void changeBinaryToDecimal(int n) {
		int num =0;
		int i=0;
		while(n>0) {
			int rem = n%10;
			if(rem!=0) {
			num = (int) (num +Math.pow(2, i));
			}
			i++;
			n/=10;
		}
		System.out.println(num);
	}

}

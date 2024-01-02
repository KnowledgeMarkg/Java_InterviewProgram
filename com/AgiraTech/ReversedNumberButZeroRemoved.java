package com.AgiraTech;

import java.util.Scanner;

public class ReversedNumberButZeroRemoved {

	public static void main(String[] args) {
		try (// 10000 -- reversed number -- 1 // 12340 -- reversed number - 4321 
		Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			
			int revNum = reversedNum(num);
			System.out.println(num +" reversed Number " + revNum );
		}

	}

	private static int reversedNum(int num) {
		int revNum =0;
		while (num !=0 ) {
			int rem = num % 10;
			if(rem!=0) {
			revNum = revNum * 10 + rem;
			}
			num/=10;
		}
		return revNum;
	}

}

package com.TapAcademy;

import java.util.Scanner;

public class FindWhetherANumberIsAPowerOf2AdobeInterviewWithBits {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A Number To Find It's PowerOf2 Or Not");
			int n = sc.nextInt();
			boolean b = checkNumberItsPowerOf2(n);
			if(b) {
				System.out.println("The Number "+n+ " is a power of 2");
			}else {
				System.out.println("The Number "+n+ " is not a power of 2");
			}
		}	
	}

	private static boolean checkNumberItsPowerOf2(int n) {
		if(n==0) {
			return false;
		}
		
		return ((n & (n-1))==0);
	}

}

package com.TapAcademy;

import java.util.Scanner;

public class FindWhetherANumberIsAPowerOf2AdobeInterview {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A Number To Find It's A Power Of 2 or Not");
			int n = sc.nextInt();
			boolean  b = findNumberIsAPowerOf2(n);
			if(b) {
			System.out.println("The Number "+n+" is a power Of 2");
			}else {
				System.out.println("The Number "+n+" is not a power Of 2");
			}
		}
	}

	private static boolean findNumberIsAPowerOf2(int n) {
		int count =0;
		int tem = n;
		boolean b = false;
		while(n>0) {
			if(n % 2 ==0) {
				count++;
				n/=2;
				b = true;
			}else {
				b = false;
				break;
			}
		}
		if(count>1) {
		System.out.println("Power of 2 is "+count+" = "+tem);
		}
		return b;
	}

}

package com.TapAcademy;

import java.util.Scanner;

public class Find_GCD_AND_LCM {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Two Number To find their GCD And LCM");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int gCD = findGCD(num1, num2);
			System.out.println("GCD of "+num1+" and "+num2+" is "+gCD);
			int lCM = findLCM(gCD, num1, num2);
			System.out.println("LCM of "+num1+" and "+num2+" is "+lCM);
		}
	}

	private static int findLCM(int gCD, int num1, int num2) {
		int lCM = (num1*num2)/gCD;
		return lCM;
	}

	private static int findGCD(int num1, int num2) {
		while(num1%num2>0) {
			int temp = num2;
			num2 = num1%num2;
			num1 = temp;
		}
		return num2;
	}

}

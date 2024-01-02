package com.TapAcademy;

import java.math.BigInteger;
import java.util.Scanner;

public class FindTheNumberOfTrailingZerosInAFactorial {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A number to find fact ");
			int n = sc.nextInt();
			BigInteger factorial = findfact(n);
            System.out.println("Factorial Of "+n+" is "+factorial);	
            String st = factorial.toString();
            int zero = findTrailingZero(st);
            System.out.println("Factorial of "+n +" is "+factorial+" and Trailing Zero is "+zero);
		}
	}

	private static int findTrailingZero(String st) {
		int count =0;
		for(int i = st.length()-1; i>=0; i--) {
			char ch = st.charAt(i);
			if(ch=='0') {
				count++;
			}else {
				break;
			}
		}
		return count;
	}

	private static BigInteger findfact(int n) {
		BigInteger fact = BigInteger.ONE;
		for(int i=1; i<=n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}
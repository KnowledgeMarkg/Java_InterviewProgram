package com.TapAcademy;

import java.util.Scanner;

public class FindTrailingZeroInfactorialOfANumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A number to find Trailing Zero in it's factorails ");
			int n = sc.nextInt();
			int zero = findTrailingZero(n);
			System.out.println("Number Of Zero is "+zero);
		}
	}

	private static int findTrailingZero(int n) {
		int count =0;
		int pow5 = 5;
		while(n>=pow5) {
		count += n/pow5;
		pow5 *=5;
		}
		return count;
	}

}

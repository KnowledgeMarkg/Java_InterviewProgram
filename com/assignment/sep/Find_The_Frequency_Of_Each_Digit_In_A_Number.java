package com.assignment.sep;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Find_The_Frequency_Of_Each_Digit_In_A_Number {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter A Number To Find It's Digit Frequency");
			int num = scanner.nextInt();
			findFrequencyOfDigit(num);
		}
	}

	private static void findFrequencyOfDigit(int num) {
		LinkedHashMap<Integer, Integer> lHashMap = new LinkedHashMap<Integer, Integer>();
		while(num >0) {
			int rem = num%10;
			lHashMap.put(rem, lHashMap.containsKey(rem)? lHashMap.get(rem)+1 : 1);
			num/=10;
		}
		for(Entry<Integer, Integer> entry : lHashMap.entrySet()) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
	}

}

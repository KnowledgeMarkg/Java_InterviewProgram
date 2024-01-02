package com.NoramalQuestions;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int fact = findFact(num);
			System.out.println("factorial Of "+num +" is " +fact);
		}
	}

	private static int findFact(int num) {
		int res = num;
		for(int i=2; i<num; i++) {
		    res*=i;
		}
		return res;
	}

}

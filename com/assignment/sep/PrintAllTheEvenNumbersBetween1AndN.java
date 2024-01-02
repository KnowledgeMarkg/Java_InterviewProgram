package com.assignment.sep;

import java.util.Scanner;

public class PrintAllTheEvenNumbersBetween1AndN {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter The Number To Print All Even Number 1 To Number");
			int n = scanner.nextInt();
			for(int i=1; i<=n; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}
	}

}

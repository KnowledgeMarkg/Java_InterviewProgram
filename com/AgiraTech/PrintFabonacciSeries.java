package com.AgiraTech;

import java.util.Scanner;

public class PrintFabonacciSeries {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Term To Find Series");
			int n = sc.nextInt();
			printFibonacci(n);
		}
	}
	private static void printFibonacci(int n) {
		int a = 0; 
		int b = 1;
		 if(n==1) {
			 System.out.println(a);
		 }
		 System.out.print(a +" ");
		 System.out.print(b +" ");
		 int c =0; 
		 for(int i=2; i<n ; i++) {
			 c = a+b;
			 System.out.print(c +" ");
			 a = b ;
			 b = c ;
		 }
	}

}

package com.kodnestMatrix;

import java.util.Scanner;

public class StroreElementsAndPrint {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Number Of Rows And Columns");
			int rows = sc.nextInt();
			int columns = sc.nextInt();
			int [][] arr = new int[rows][columns];
			
			for(int i=0; i<arr.length ;i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("The Elements Of Matrix Is ");
			System.out.println();
			for(int i=0; i<arr.length; i++) {
				for(int j=0 ; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+"  ");
				}
				System.out.println();
			}
		}
	}

}

package com.TapAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class LonelyIntegerHackerrankXOR_Operator {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Size OF An Array");
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			
			int num = findLonelyElement(arr);
			System.out.println("The Lonely Elenment in this Array "+Arrays.toString(arr)+" is "+num );
		}
	}

	private static int findLonelyElement(int[] arr) {
		int result = 0;
		for(int i : arr) {
			result = result ^ i;
		}
		return result;
	}

}

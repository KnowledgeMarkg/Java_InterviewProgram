package com.KodnestArray;

import java.util.Scanner;

public class ArrayElementSwap {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Length Of Array");
			int length = sc.nextInt();
			int[] arr = new int[length];
			System.out.println("Enter The Element Of An Array Length is : "+length);
			for(int i=0 ; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter The Two Indexes Which we Are want to swap");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Before swap Print Array");
			for(int i=0 ;i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			for(int i=0; i<arr.length ; i++) {
				int tem = arr[num1];
				arr[num1] = arr[num2];
				arr[num2] = tem;
			}
			System.out.println();
			
			System.out.println("After Swap Print Array");
			for(int i=0 ;i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}

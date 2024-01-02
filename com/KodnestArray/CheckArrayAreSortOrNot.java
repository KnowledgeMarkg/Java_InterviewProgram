package com.KodnestArray;

import java.util.Arrays;

public class CheckArrayAreSortOrNot {

	public static void main(String[] args) {
		// TODO A Java Program to check whether the array elements are present in sorted order or not 
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {10, 30, 20, 50, 40};
		
        boolean b = checkArraySortOrNot(arr2); 
        if(b) {
        	System.out.println("Array "+Arrays.toString(arr2) +" is not Sorted");
        }else {
        	System.out.println("Array "+Arrays.toString(arr2) +" is Sorted");
        }
	}

	private static boolean checkArraySortOrNot(int[] arr1) {
		boolean b = false;
		for(int i=0; i<arr1.length-2 ; i++) {
				if(arr1[i] > arr1[i+1]) {
					b =true;
				}
		}
		return b;
	}

}

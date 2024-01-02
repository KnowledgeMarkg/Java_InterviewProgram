package com.KodnestArray;

import java.util.Arrays;

public class SelectiomSortKodnest {

	public static void main(String[] args) {
		int[] arr = {82, 72, 54, 29,  33};
		System.out.println("Before Sorting"+Arrays.toString(arr));
		
		for(int i=0; i<arr.length-2 ; i++) {
			int pos = i; 
			int min = arr[pos];
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		System.out.println("After Sorting"+Arrays.toString(arr));

	}

}

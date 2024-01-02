package com.AgiraTech;

import java.util.Arrays;

public class SortTheArray {

	public static void main(String[] args) {
		int[] arr = {20, 10, 6 , 23, 5};
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("After Sorting " +Arrays.toString(arr));
		System.out.println("Second Largest " +arr[arr.length-2]);
	}

}

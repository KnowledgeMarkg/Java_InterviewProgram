package com.KodnestArray;

import java.util.Arrays;

public class BubbleSortProgram {

	public static void main(String[] args) {
		int[] arr = {86, 72, 54, 24, 33};
		int[] sortArr = sortArrayByBubbleSort(arr);
		System.out.println(Arrays.toString(sortArr));
	}

	private static int[] sortArrayByBubbleSort(int[] arr) {
		for(int i=0; i<=arr.length-2; i++) {
			for(int j=0 ; j<=arr.length-2-i ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}

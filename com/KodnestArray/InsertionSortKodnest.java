package com.KodnestArray;
import java.util.Arrays;

public class InsertionSortKodnest {
	public static void main(String[] args) {
		int[] arr = {82, 72, 54, 29,  33};
		System.out.println("Before Sorting"+Arrays.toString(arr));
		for(int i=1; i<arr.length ; i++) {
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]> item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
		System.out.println("After Sorting"+Arrays.toString(arr));
	}
}

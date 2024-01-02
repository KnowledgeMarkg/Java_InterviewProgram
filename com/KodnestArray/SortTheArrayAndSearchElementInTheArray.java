package com.KodnestArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheArrayAndSearchElementInTheArray {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] arr = {33,22,11,55,44,99,66};
			System.out.println("Enter The Element Which We Are Want To Search");
			int element = sc.nextInt();
			sortArrayByUserDefineMeth(arr);
			int eleAvl = searchElement(element , arr);
			 if(eleAvl==-1) {
				   System.out.println("Element "+eleAvl +" is not present in this Array " +Arrays.toString(arr));
			   }else {
				   System.out.println("Element "+eleAvl +" is present in this Array : " +Arrays.toString(arr) +" position is "+eleAvl);
			   }
		}
	}

	private static int searchElement(int num, int[] arr) {
		int left =0 , right = arr.length-1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(num == arr[mid]) {
				return mid;
			}else if(num < arr[mid]) {
				right = mid-1;
			}else if(num > arr[mid]) {
				left = mid+1;
			}
		}
		return -1;
	}

	private static void sortArrayByUserDefineMeth(int[] arr) {
		for(int i=0 ;i<arr.length ;i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp = arr[i];
			if(arr[i]>arr[j]) {
				arr[i] = arr[j];
				arr[j] =temp;
			}
		  }
		}
		System.out.println(Arrays.toString(arr));
	}

}

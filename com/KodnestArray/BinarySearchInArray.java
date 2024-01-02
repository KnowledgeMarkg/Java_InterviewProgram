package com.KodnestArray;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInArray {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Number Of Element ");
			int ind = sc.nextInt();
			int[] arr = new int[ind];
			System.out.println("Enter The Element Of An Array");
			for(int i=0 ; i<arr.length ; i++) {
				arr[i] = sc.nextInt();
			}
			
		   System.out.println("Enter The Element Which we are want to search");
		   int num = sc.nextInt();
		   
		   int eleAvl = binarySearch(arr, num);
		   if(eleAvl==-1) {
			   System.out.println("Element "+num +" is not present in this Array " +Arrays.toString(arr));
		   }else {
			   System.out.println("Element "+num +" is present in this Array : " +Arrays.toString(arr) +" position is "+eleAvl);
		   }
		}
	}

	private static int binarySearch(int[] arr, int num) {
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

}

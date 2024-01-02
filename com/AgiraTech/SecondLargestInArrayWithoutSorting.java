package com.AgiraTech;

public class SecondLargestInArrayWithoutSorting {

	public static void main(String[] args) {
		int[] arr = {20, 10, 6 , 23, 5}; 
		int largest = -1;
		int secondLargest = -1;
		for(int i =0 ; i< arr.length ; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if ( arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Largest In Array " +largest);
		System.out.println("Second Largest In Array " +secondLargest);
	}

}

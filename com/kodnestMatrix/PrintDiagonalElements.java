package com.kodnestMatrix;

public class PrintDiagonalElements {

	public static void main(String[] args) {
		int[][] arr = {{ 11, 12, 13, 14},
	                   { 16, 17, 18, 19},
	                   { 21, 22, 23, 24},
	                   { 26, 27, 28, 29}};
		for(int i=0 ;i<arr.length; i++) {
			for(int j=0 ; j<arr[i].length; j++) {
				if(i==j) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		System.out.println();
		int n=0;
		for(int i=0 ;i<arr.length; i++) {
			for(int j=0 ; j<arr[i].length; j++) {
				if(n==i && j==arr.length-1-i) {
					System.out.print(arr[i][j]+" ");
				}
			}
			n++;
		}

	}

}

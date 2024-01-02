package com.kodnestMatrix;

public class SumOfMatrixElements {

	public static void main(String[] args) {
		int[][] arr1 = {{ 11, 12, 13, 14},
                        { 16, 17, 18, 19},
                        { 21, 22, 23, 24},
                        { 26, 27, 28, 29}};
		int[][] arr2 = {{ 1, 2, 3, 4},
                        { 6, 7, 8, 9},
                        { 2, 2, 3, 4},
                        { 6, 2, 8, 9}};
		int[][] arr3 = new int[arr1.length][arr1.length];
		
		for(int i=0 ;i<arr3.length ; i++) {
			for(int j=0 ; j<arr3[i].length; j++) {
				arr3[i][j] = arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

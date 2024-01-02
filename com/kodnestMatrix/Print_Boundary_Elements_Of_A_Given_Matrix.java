package com.kodnestMatrix;

public class Print_Boundary_Elements_Of_A_Given_Matrix {

	public static void main(String[] args) {
		int[][] arr = {{ 11, 12, 13, 14},
		               { 16, 17, 18, 19},
		               { 21, 22, 23, 24},
		               { 26, 27, 28, 29}};
		int i=0;
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		
		int j = arr.length-1;
		for(i=1; i<arr.length; i++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		i = arr.length-1;
		for(j=arr.length-2; j>=0; j--) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		j=0;
		for(i=arr.length-2; i>=1 ; i--) {
			System.out.print(arr[i][j]+" ");
		}
	}

}

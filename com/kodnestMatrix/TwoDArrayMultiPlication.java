package com.kodnestMatrix;

import java.util.Scanner;

public class TwoDArrayMultiPlication {

	public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
		int r1 = sc.nextInt();
		   int c1 = sc.nextInt();
		   int [][] arr1 = new int[r1][c1];
		   System.out.println("Enter Elements Of 1st Array");
		   for(int i=0 ; i<arr1.length; i++) {
			   for(int j=0 ;j<arr1[i].length ; j++) {
				   arr1[i][j] = sc.nextInt();
			   }
		   }
		   System.out.println("Enter 2nd Array row and column");
		   int r2 = sc.nextInt();
		   int c2 = sc.nextInt();
		   int [][] arr2 = new int[r2][c2];
		   System.out.println("Enter 2nd Array Elements");
		   for(int i=0 ; i<arr2.length; i++) {
			   for(int j=0 ;j<arr2[i].length ; j++) {
				   arr2[i][j] = sc.nextInt();
			   }
		   }
		   if(c1!=r2) {
			   System.out.println("Multiplication Not Allow Because 1st Array row "+r1 +"is equal to second Array "+c2);
			   return;
		   }
		   int[][] prodArr = new int[r1][c2];
		   
		   for(int i=0 ; i<prodArr.length ; i++) {
			   for(int j=0; j<prodArr[i].length ; j++) {
				   for(int k=0 ; k<r1 ; k++) {
					   prodArr[i][j] += arr1[i][k]* arr2[k][j];
				   }
			   }
		   }
		   for(int i=0 ; i<prodArr.length ; i++) {
			   for(int j=0; j<prodArr[i].length ; j++) {
			     System.out.print(prodArr[i][j]+" ");
			   }
			   System.out.println();
		   }
	}
	}

}

package com.pattern.design;

public class Pattern_4 {

	public static void main(String[] args) {
	   int nsp =4, nst =1 , n=5;
	   for(int i=0 ; i<n ; i++) {
		   for(int j =0; j<nsp ; j++) {
			   System.out.print(" ");
		   }
		   for(int j =0 ; j<nst ; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
		   nsp--;
		   nst+=2;
	   }
	}
}

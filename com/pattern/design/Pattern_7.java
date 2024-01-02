package com.pattern.design;

public class Pattern_7 {

	public static void main(String[] args) {
		int nsp =5 , nst =1, n=5;
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<nsp ; j++) {
				System.out.print(" ");
			}
			for(int j =0 ; j<nst ; j++) {
				System.out.print("*");
			}
			nsp--; 
			nst++;
			System.out.println();
		}

	}

}

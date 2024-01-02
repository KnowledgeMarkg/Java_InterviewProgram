package com.pattern.design;

public class Pattern_2 {

	public static void main(String[] args) {
		int nst =5 , n =5;
		for(int i=0 ; i<n ;i++) {
			for(int j=0 ;j<nst ; j++) {
				System.out.print("* ");
			}
			nst --; 
			System.out.println();
		}
	}

}

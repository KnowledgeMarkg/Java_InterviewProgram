package com.pattern.design;

public class Pattern_6 {

	public static void main(String[] args) {
		int nsp =1, nst = 5, n=5;
		for(int i=0 ; i<n; i++) {
			for(int j=0 ; j<nsp; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<nst; j++) {
				System.out.print("*");
			}
			nst--;
			nsp++;
			System.out.println();
		}
	}

}

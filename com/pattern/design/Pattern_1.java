package com.pattern.design;

public class Pattern_1 {

	public static void main(String[] args) {
		 int nst = 1 , n=5;
		 for (int i = 1; i <=n; i++) {
			for(int j= 1 ; j<=nst ; j++) {
				System.out.print("* ");
			}
			nst++;
			System.out.println();
		}
	}

}

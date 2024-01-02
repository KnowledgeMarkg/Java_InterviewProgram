package com.AgiraTech;

public class FindLargestOf3Number {

	public static void main(String[] args) {
		int a =10;
		int b =20; 
		int c =37;
		int d =  a > b ? (a > c? a : c) : (b>c ? b :c);
		System.out.println(d);
	}

}

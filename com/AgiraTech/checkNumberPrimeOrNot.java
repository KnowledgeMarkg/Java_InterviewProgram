package com.AgiraTech;

public class checkNumberPrimeOrNot {

	public static void main(String[] args) {
		int num = 23;
		boolean b = false;
		for(int i =2; i<=Math.sqrt(num); i++) {
			if(num % i == 0 ) {
				b = false;
				break;
			}else {
				b = true;
			}
		}
		if(b ) {
			System.out.println("Number "+num +" is Prime");
		}else {
			System.out.println("number "+num +" is not Prime");
		}
	}

}

package com.Kodnest.A4.July;

public class ThePowerOfSquares {

	public static void main(String[] args) {
         int num = 10;
         int num2 = 3;
         
         int squar= squareNumber(num);
         int cube= cubeNumber(num2);
         
         System.out.println(squar);
         System.out.println(cube);
	}

	private static int cubeNumber(int num) {
		 int cube = (int) Math.pow(num, 3);
		 
		return cube;
	}

	private static int squareNumber(int num) {
		 int square =(int)Math.pow(num, 2);
		return square;
	}

}

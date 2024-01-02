package com.Kodnest.A4.July;

public class ArithmeticOperations2 {

	public static void main(String[] args) {
      int num1 =20;
      int num2 = 15;
      int sub= subtractNumbers(num1, num2);
      int mul = multiplyNumbers(num1, num2);
      double div = divideNumbers(num1, num2);
      int rem = findRemainder(num1, num2);
      System.out.println("Subtraction is : "+sub);
      System.out.println("Multiplication is : "+mul);
      System.out.println("Division is : " +div);
      System.out.println("Remaindar is : "+rem);
     
	}

	private static int findRemainder(int num1, int num2) {
		 int rem = num1%num2;
		return rem;
	}

	private static double divideNumbers(int num1, int num2) {
		double div = num1/num2;
		return div;
	}

	private static int multiplyNumbers(int num1, int num2) {
		 int mul = num1*num2;
		return mul;
	}

	private static int subtractNumbers(int num1, int num2) {
		int sub = num1-num2;
		return sub;
	}

}

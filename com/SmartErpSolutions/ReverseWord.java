package com.SmartErpSolutions;

public class ReverseWord {

	public static void main(String[] args) {
		String str = "Welcome To Java Wolrd";
		String[] strArr = str.split(" ");
		
		for(int i=strArr.length-1; i>=0; i-- ) {
			System.out.print(strArr[i]+" ");
		}
	}

}

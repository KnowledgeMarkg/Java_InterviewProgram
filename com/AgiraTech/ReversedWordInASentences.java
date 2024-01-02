package com.AgiraTech;

public class ReversedWordInASentences {

	public static void main(String[] args) {
		String str = "Welcome To Java Programming";
		String st = reversedWord(str);
		System.out.print("Old String " +str);
		System.out.println();
		System.out.print("Reversed String "+st);
	}

	private static String reversedWord(String str) {
		String[] strArr = str.split(" ");
		String revStr = "";
		for(int i = strArr.length-1; i>=0; i-- ) {
			revStr+=strArr[i]+" ";
		}
		return revStr;
	}

}

package com.Code;

public class RemoveSpecialCharactersInString1 {

	public static void main(String[] args) {
		String input = "Hello,   @World!   How's   #java?";
        String regexString = "[^a-zA-Z0-9]";
        String string= removeSpecialChar(input,regexString);
        System.out.println(string);
	}

	private static String removeSpecialChar(String input, String regexString) {
		 input= input.replaceAll(regexString, "");
		return input;
	}
}

package com.Code.Practice;

public class RemoveSpecialCharactersInString {

	public static void main(String[] args) {
		String in = "Hello, @World! How's #java?";
		StringBuffer bfBuffer = new StringBuffer(in);
		
		String ans = "";
		for(int i = 0; i < in.length();i++) {
			int val = (int)in.charAt(i);
			if( val >= 65 && val <= 91) {
				
				
				ans += in.charAt(i);
			}
			
			else if((val >= 97 && val <= 123)) {
				ans += in.charAt(i);
			}
		}
		System.out.println(ans);
	}
	

}

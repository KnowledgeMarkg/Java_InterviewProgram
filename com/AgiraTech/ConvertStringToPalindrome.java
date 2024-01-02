package com.AgiraTech;

public class ConvertStringToPalindrome {

	public static void main(String[] args) {
		String st = "abdba";
		convertStringPalindrome(st);
	}

	private static void convertStringPalindrome(String st) {
		boolean b = checkPalindrome(st);
		if(b) {
			System.out.println("String " +st+" is palindrome Already");
		}else {
			StringBuilder sb = new StringBuilder();
			sb.append(st.substring(0, st.length()-1));
			st+=sb.reverse();
			System.out.println(st);
			System.out.println(checkPalindrome(st));
		}
		
	}

	private static boolean checkPalindrome(String st) {
		String temp = st;
		String str = "";
		for(int i= st.length()-1; i>=0; i--) {
			str+=st.charAt(i);
		}
		return str.equals(st);
	}

}

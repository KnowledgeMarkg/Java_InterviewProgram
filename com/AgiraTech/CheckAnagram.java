package com.AgiraTech;

public class CheckAnagram {

	public static void main(String[] args) {
	    // Two String are anagram when each character of both string is same order not matter
		String st1 = "aab";
		String st2 = "baa";
		
		boolean c = checkAnagram1(st1, st2);
		boolean b  = checkAnagram2(st1, st2);
		if(b) {
			System.out.println("String " +st1 + " and " +st2 +" is Anagram" );
		}else {
			System.out.println("String " +st1 + " and " +st2 +" is not Anagram" );
		}
	}

	private static boolean checkAnagram2(String st1, String st2) {
		boolean b = false;
		if(st1.length() != st2.length()) {
			return false;
		}
		for(int i=0; i<st1.length(); i++) {
			if(st2.indexOf(st1.charAt(i))<0) {
				b = false;
			}else {
				b = true;
			}
		}
		return b;
	}

	private static boolean checkAnagram1(String st1, String st2) {
		boolean b = false;
		if(st1.length() != st2.length()) {
			return false;
		}
		
		for(int i=0; i<st1.length(); i++) {
			if(st2.contains(st1.charAt(i)+"")) {
				b = true;
			}else {
				b = false;
			}
		}
		return false;
	}

}

package com.String.kodnest;

public class StringCompressionLeetcodeMediumJAVA {
	public static void main(String[] args) {
		String str = "aaabcccddeff";
		removeDuplicateChar(str);
		removeDuplicateCharAddDubplicateCharCount(str);
	}
	private static void removeDuplicateChar(String str) {
		String str1 = str.charAt(0)+"";
		for(int i=1; i<str.length(); i++) {
			char currChar = str.charAt(i);
			char prevchar = str.charAt(i-1);
			if(currChar!=prevchar) {
				str1+=currChar;
			}
		}
		System.out.println("1st type of Compression of "+str+" is "+str1);
	}
	private static void removeDuplicateCharAddDubplicateCharCount(String str) {
		String str1 = str.charAt(0)+"";
		int count =1;
		for(int i=1; i<str.length(); i++) {
			char currChar = str.charAt(i);
			char prevChar = str.charAt(i-1);
			if(currChar==prevChar) {
				count++;
			}else {
				if(count>1) {
				str1+=count;
				count=1;
				}
				str1+=currChar;
			}
		}
		if(count>1) {
			str1+=count;
			}
		System.out.println("2nd type of Compression of "+str+" is "+str1);
	}

}

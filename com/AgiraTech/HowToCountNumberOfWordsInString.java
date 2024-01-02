package com.AgiraTech;

public class HowToCountNumberOfWordsInString {

	public static void main(String[] args) {
		String str = " Kausar  Raza Ansari ";
		str = str.trim();
		int wordCount = countWord(str);
		System.out.println(wordCount);
	}

	private static int countWord(String str) {
		int count =1;
		for(int i=0; i<str.length() ;i++) {
			char ch = str.charAt(i);
			if(ch == ' ' && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		return count;
	}

}

package com.Code.Practice;

import java.util.HashSet;

public class FirstRepeatedWordOfString {

	public static void main(String[] args) {
		String str = "Kausar Raza take trainning in Kodenest Kausar is a trainee in kodnest";
		String st = findFirstRepeatedWord(str);
		System.out.println("First Repeated Word is : "+st);
	}

	private static String findFirstRepeatedWord(String str) {
		String words[]= str.split(" ");
		HashSet<String> hs = new HashSet<String>();
		for(String word : words) {
			if(hs.contains(word)) {
				return word;
			}
			hs.add(word);
		}
		return "Words not repeated";
	}

}

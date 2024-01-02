package com.String.kodnest;

public class CapitalizeTheFirstLetterOfEachWordInASentenceInJava {

	public static void main(String[] args) {
		String str = "the quick brown fox jumped over the lazy dog.";
		String newStr = capitalizeLetter(str);
		System.out.println("Old Letter Is "+str);
		System.out.println("New Letter is "+newStr);
	}

	private static String capitalizeLetter(String str) {
		String[] words  = str.split(" ");
		StringBuffer bf = new StringBuffer();
		for(String str1 : words) {
			 bf.append(Character.toUpperCase(str1.charAt(0))+""+str1.substring(1)+" ");
		}

		return bf.toString();
	}

}

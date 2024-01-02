package com.String.kodnest;

public class FindLongestWordsInSentences {

	public static void main(String[] args) {
		String str = "I am learningdfgdf Java Programminh";
		String word = findLongestWord(str);
		System.out.println(word);
	}

	private static String findLongestWord(String str) {
		  String[] strArr = str.split(" ");
		  String longestWord = "";
		  int count =0; 
		  for(String st : strArr) {
			  int l = st.length();
			  if(l>=count) {
				  count = l;
				  longestWord = st;
			  }
		  }
		  System.out.println(count);
		return longestWord;
	}

}

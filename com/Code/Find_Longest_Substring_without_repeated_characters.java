package com.Code;

import java.util.LinkedHashMap;

public class Find_Longest_Substring_without_repeated_characters {

	public static void main(String[] args) {
		// Example java --- Find Longest Substring without repeated characters  ---- jav
		
		String string = "jaavabcad";
		findLongestSubstring(string);
	}

	private static void findLongestSubstring(String string) {
		String longestSubstring= null;
		int sizeOfSubString =0;
		LinkedHashMap<Character, Integer> hsHashMap = new LinkedHashMap<Character, Integer>();
		char[] ch = string.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(!hsHashMap.containsKey(ch[i])) {
				hsHashMap.put(ch[i], i);
			}else {
				hsHashMap.clear();
			}
			
			if(hsHashMap.size()>sizeOfSubString) {
				sizeOfSubString= hsHashMap.size();
				longestSubstring = hsHashMap.keySet().toString();
			}
		}
		System.out.println(sizeOfSubString);
		System.out.println(longestSubstring);
	}

}

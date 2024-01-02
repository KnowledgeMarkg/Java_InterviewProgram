package com.String.kodnest;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindLongestSubstringWithoutRepeatedCharacter {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
//		String str = "abbca";
			findLongestSubString(str);
		}
	}

	private static void findLongestSubString(String str) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
		int logestSubStringSize=0;
		String logestSubString =null;
		
		for(int i=0; i<ch.length; i++) {
			if(!lhm.containsKey(ch[i])) {
				lhm.put(ch[i], i);
			}else {
				i = lhm.get(ch[i]);
				lhm.clear();
			}
			
			if(lhm.size()>logestSubStringSize) {
				logestSubStringSize= lhm.size();
				logestSubString = lhm.keySet().toString();
			}
		}
		for(Entry<Character, Integer> entry : lhm.entrySet()) {
			System.out.print(entry.getKey());
		}
//		System.out.println("Lognest SubString is " +logestSubString +" and size is "+logestSubStringSize);
	}

}

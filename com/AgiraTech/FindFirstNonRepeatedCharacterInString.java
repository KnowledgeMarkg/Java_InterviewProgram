package com.AgiraTech;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		String st = "aaabbsescc";
		find1stNonRepeatingChar(st);
		
	}

	private static void find1stNonRepeatingChar(String st) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		
		char[] chArr = st.toCharArray();
		for(Character c : chArr) {
			if(!lhm.containsKey(c)) {
				lhm.put(c, 1);
			}else {
				lhm.put(c, lhm.get(c)+1);
			}
		}
		
		for(Entry<Character, Integer> entry : lhm.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}

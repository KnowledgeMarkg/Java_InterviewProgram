package com.SmartErpSolutions;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingCharInString {

	public static void main(String[] args) {
		String str = "aabbdef";
		findFirstNonRepeat(str);
	}

	private static void findFirstNonRepeat(String str) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
		for(Character chr : ch) {
			if(!lhm.containsKey(chr)) {
				lhm.put(chr, 1);
			}else {
				lhm.put(chr, lhm.get(chr)+1);
			}
		}
		
		for(Entry<Character, Integer> entry : lhm.entrySet() ) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}

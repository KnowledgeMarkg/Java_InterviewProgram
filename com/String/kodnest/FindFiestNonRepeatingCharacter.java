package com.String.kodnest;
import java.util.*;
import java.util.Map.Entry;
public class FindFiestNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "programming";
		char ch = findFirstRepeatingChar(str);
		System.out.println(ch);
		
	}

	private static char findFirstRepeatingChar(String str) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
		for(Character chr : ch) {
			if(!lhm.containsKey(chr)) {
				lhm.put(chr, 1);
			}else {
				lhm.put(chr, lhm.get(chr)+1);
			}
		}
		char chhr = 0;
		for(Entry<Character, Integer> entry : lhm.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		return chhr;
	}

}

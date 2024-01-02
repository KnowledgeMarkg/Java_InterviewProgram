package com.Code.Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindCharOccurence {

	public static void main(String[] args) {
     String st = "Kausar Raza Ansari ";
     
     st = st.replaceAll("\\s+", "").toLowerCase();
     findCharOccurence(st);
	}

	private static void findCharOccurence(String st) {
		LinkedHashMap<Character, Integer> lhm =new LinkedHashMap<Character, Integer>();
		
		for(Character ch : st.toCharArray()) {
			lhm.put(ch, lhm.containsKey(ch) ? lhm.get(ch)+1: 1);
		}
		
		for(Entry<Character, Integer> entry : lhm.entrySet() ) {
			System.out.println(entry.getKey()+ " : "+ entry.getValue());
		}
	}

}

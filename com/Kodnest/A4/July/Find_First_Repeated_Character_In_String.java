package com.Kodnest.A4.July;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Find_First_Repeated_Character_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String st = "aabbddsseff";
	        st = st.replaceAll("\\s+", "");
	        char ch = findFirstRepeatedCharacter(st);
	        System.out.println(ch);
	}
	private static char findFirstRepeatedCharacter(String st) {
		LinkedHashMap<Character, Integer> hs = new LinkedHashMap<Character, Integer>();
		for(Character ch : st.toCharArray()) {
			if(hs.containsKey(ch)) {
				hs.put(ch, hs.get(ch)+1);
			}else {
				hs.put(ch, 1);
			}
		}
		for(Entry<Character, Integer> entry : hs.entrySet()) {
			if(entry.getValue()==2) {
				return entry.getKey();
			}
		}
		return 0;
	}

}

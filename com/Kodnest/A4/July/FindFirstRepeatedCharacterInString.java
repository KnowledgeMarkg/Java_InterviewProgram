package com.Kodnest.A4.July;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFirstRepeatedCharacterInString {

	public static void main(String[] args) {
       String st= "Hello World !";
       st = st.replaceAll("\\s+", "");
       seprateWord(st.trim());
	}

	private static void seprateWord(String st) {
		// TODO Auto-generated method stub
		LinkedHashMap<Character, Integer>  hs = new LinkedHashMap<Character, Integer>();
		for(Character ch : st.toCharArray()) {
			hs.put(ch, hs.containsKey(ch)? hs.get(ch)+1: 1);
		}
		for(Entry<Character, Integer> entry : hs.entrySet()) {
			System.out.println(entry.getKey() +":" + entry.getValue());
		}
	}

}

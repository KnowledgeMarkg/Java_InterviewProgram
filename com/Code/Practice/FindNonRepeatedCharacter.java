package com.Code.Practice;

import java.util.HashSet;

public class FindNonRepeatedCharacter {

	public static void main(String[] args) {
     String str ="Kausar Raza Ansari";
     str = str.replaceAll("\\s+", "");
     findNonRepeatedChar(str);
	}

	private static void findNonRepeatedChar(String str) {
		HashSet<Character> hs = new HashSet<Character>();
		for(Character ch : str.toCharArray()) {
			if(!hs.contains(ch))
			hs.add(ch);
		}
		System.out.println(hs.toString());
	}

}

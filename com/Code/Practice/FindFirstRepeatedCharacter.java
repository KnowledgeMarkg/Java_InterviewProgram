package com.Code.Practice;

import java.util.HashSet;

public class FindFirstRepeatedCharacter {
     
	public static void main(String[] args) {
       String str ="asdbdabnfv";
       char ch = firstRepeatedCharacter(str);
       System.out.println("First Repeated Character is : " +ch);
	}

	private static char firstRepeatedCharacter(String str) {
		HashSet<Character> hs = new HashSet<Character>();
		
		for(Character ch : str.toCharArray()) {
			if(hs.contains(ch)) {
				return ch;
			}
			hs.add(ch);
		}
		return 0;
	}

}

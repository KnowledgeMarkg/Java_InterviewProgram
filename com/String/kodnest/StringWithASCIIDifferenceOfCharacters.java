package com.String.kodnest;

public class StringWithASCIIDifferenceOfCharacters {

	public static void main(String[] args) {
		String str = "abdgca";
		char[] ch = str.toCharArray();
		StringBuffer st = new StringBuffer();
		for(int i=1; i<ch.length; i++) {
			int val = ch[i] - ch[i-1];
			st.append(val);
			st.append(ch[i]);
		}
		System.out.println(st);
	}

}

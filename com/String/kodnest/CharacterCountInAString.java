package com.String.kodnest;

public class CharacterCountInAString {

	public static void main(String[] args) {
		String str = "programming";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
		     if(sb.indexOf(ch+"")<0) {
		    	 sb.append(ch);
		     }
		}		
		System.out.println(sb);
		for(int i=0; i<sb.length(); i++) {
			int count =0;
			for(int j=0; j<str.length(); j++) {
				if(sb.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			System.out.println(sb.charAt(i)+""+count);
		}
	}

}

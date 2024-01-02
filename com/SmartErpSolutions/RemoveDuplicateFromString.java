package com.SmartErpSolutions;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String st = "Kausar Raza";
		String str = "";
		
		for(int i=0; i<st.length(); i++) {
			char ch = st.charAt(i);
			if(!str.contains(ch+"")) {
				str+=ch;
			}
		}
		System.out.println(str);
	}

}

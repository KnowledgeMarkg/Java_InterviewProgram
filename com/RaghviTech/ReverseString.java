package com.RaghviTech;

public class ReverseString {

	public static void main(String[] args) {
		String string = "How are you?";
		String [] strings = string.split(" ");
		for(String string2 :strings) {
			for(int i=string2.length()-1; i>=0; i--) {
				System.out.print(string2.charAt(i));
			}
		}
	}

}

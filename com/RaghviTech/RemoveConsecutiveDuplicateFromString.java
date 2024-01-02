package com.RaghviTech;

import java.util.ArrayDeque;

public class RemoveConsecutiveDuplicateFromString {

	public static void main(String[] args) {
		String string = "aabscddhgss";
		removeConsecutiveChar(string);
	}

	private static void removeConsecutiveChar(String string) {
		StringBuffer sBuffer = new StringBuffer();
		ArrayDeque<Character> aqArrayDeque= new ArrayDeque<Character>();
		for(Character ch: string.toCharArray()) {
			if (! aqArrayDeque.isEmpty() && aqArrayDeque.peekLast()==ch) {
				continue;
			}
			aqArrayDeque.addLast(ch);
			sBuffer.append(ch);
		}
		System.out.println(sBuffer.toString());
	}

}

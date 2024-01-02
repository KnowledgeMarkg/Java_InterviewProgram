package com.Kodnest.A4.July;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RemoveConsecutiveCharactersInAString {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		   String st = sc.next();
		   removeCharater(st);
		}
	}

	private static void removeCharater(String st) {
		 ArrayDeque<Character> dq = new ArrayDeque<Character>();
		 StringBuffer sb = new StringBuffer();
		 for(Character ch : st.toCharArray()) {
			 if(!dq.isEmpty() && dq.peekLast()==ch) {
				 continue;
			 }
			 dq.addLast(ch);
			 sb.append(ch);
		 }
		 System.out.println(sb.toString());
	}

}

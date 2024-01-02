package supaiTech;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RemoveConsecutiveDuplicateFromString1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		
		String newst = removeconsecutiveChar(st);
		System.out.println(newst);
	}

	private static String removeconsecutiveChar(String st) {
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Character> arrD = new ArrayDeque<>();
		for(char ch : st.toCharArray()) {
			if(!arrD.isEmpty() && arrD.peekLast()== ch) {
				continue;
			}
			
			arrD.add(ch);
			sb.append(ch);
		}
		return sb.toString();
	}

}

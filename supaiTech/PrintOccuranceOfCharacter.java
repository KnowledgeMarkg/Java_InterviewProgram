package supaiTech;

import java.util.HashMap;
import java.util.Map;

public class PrintOccuranceOfCharacter {

	public static void main(String[] args) {
		String paragraph = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
                + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
                + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
                + "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		printOccuranceOfChar(paragraph);
	}

	private static void printOccuranceOfChar(String paragraph) {
		char[] charArray = paragraph.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		for(Character ch : charArray) {
			if(Character.isLetter(ch)) {
				ch = Character.toLowerCase(ch);
				hmap.put(ch, hmap.getOrDefault(ch, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() +" = "+ entry.getValue());
		}
	}

}

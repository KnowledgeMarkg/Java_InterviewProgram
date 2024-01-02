package accelerateSoftwareCompany;

import java.util.ArrayDeque;

public class RemoveConsecutiveDuplicateFromString {

	public static void main(String[] args) {
		String str = "aabscddhgss";
		removeConsecutiveDuplicateChar(str);
	}

	private static void removeConsecutiveDuplicateChar(String str) {
		ArrayDeque<Character> adeque = new ArrayDeque<Character>();
		StringBuffer sb = new StringBuffer();
		for(Character ch : str.toCharArray() ) {
			if(!adeque.isEmpty() && adeque.peekLast()==ch) {
				continue;
			}
			adeque.addLast(ch);
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}

}

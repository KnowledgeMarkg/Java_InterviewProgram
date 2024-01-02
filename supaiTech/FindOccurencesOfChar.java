package supaiTech;

import java.util.*;
public class FindOccurencesOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Setences To Find Chararcter Repetation Count");
		String st = sc.nextLine();
		
		String ch = sc.next();
		
		int n = findRepeatation(st,ch);
		
		
		System.out.println(ch+" character repeated " +n+ " times in the given string "+st);
		
	}

	private static int findRepeatation(String st, String ch) {
		int tlength = st.length();
		int tlen = st.replaceAll(ch, "").length();
		
		int charCount = tlength-tlen;
		return charCount;
	}

}

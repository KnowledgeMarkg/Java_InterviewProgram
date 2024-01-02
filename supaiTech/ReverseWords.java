package supaiTech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
	    reversedWord(st);
	    String str = reverseWord(st);
	    System.out.println("2nd "+str);
	}

	private static String reverseWord(String st) {
		String[] strArr = st.split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		for(int i= strArr.length-1; i>=0; i--) {
			sb.append(strArr[i]+" ");
		}
		return sb.toString();
	}

	private static void reversedWord(String st) {
		List<String> list = Arrays.asList(st.split("\\s+"));
		Collections.reverse(list);
		System.out.println(list);
	}

}

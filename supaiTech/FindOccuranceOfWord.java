package supaiTech;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindOccuranceOfWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Paragraph");
		String st = sc.nextLine();
		System.out.println("Enter The Word");
		String word = sc.next();
		
		int count = findWordOccurence(st, word);
		int n1 = findRepeatationWithColl(st, word);
		
		System.out.println("The Word "+word + " is repeated "+count +" in this Given Paragraph "+st);
		System.out.println(word+" character repeated " +n1+ " times in the given string "+st);
		
	}
	
	private static int findRepeatationWithColl(String st, String ch) {
		String[] strArr = st.split("\\s+");
		List<String> stList = Arrays.asList(strArr);
		int count =0;
		for(String str : stList) {
			if(str.equals(ch)) {
				count++;
			}
		}
		return count;
	}


	private static int findWordOccurence(String st, String word) {
		String[] stArr  = st.split(" "); 
		int count =0;
		for(String str : stArr) {
			if(str.equals(word)) {
				count++;
			}
		}
		return count;
	}

}

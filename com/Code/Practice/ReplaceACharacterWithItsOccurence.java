package com.Code.Practice;

public class ReplaceACharacterWithItsOccurence {

	public static void main(String[] args) {
		// Example  OPENTEXT----- OPEN1EX2 ---  Replace T with its occurrence
         String st = "OPENTEXT";
         char replaceChar = 'x';
         replaceCharacter(st, replaceChar);
         
	}

	private static void replaceCharacter(String st , char replaceChar) {
		StringBuffer sb = new StringBuffer();
		int i=1;
		if(st.indexOf(replaceChar)==-1) {
			System.out.println("Given Character Not Found In String");
			System.exit(0);
		}else {
		for(Character ch : st.toCharArray()) {
			if(ch==replaceChar) {
				sb.append(i);
				i++;
			}else {
			sb.append(ch);
			}
		}
		}
		System.out.println(sb.toString());
	}

}

package com.Code.Practice;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Kausar Raza Ansari";
        String reverseString = doReverse(str);
        System.out.println(reverseString);
	}

	private static String doReverse(String str) {
		String word[] = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i= word.length-1; i>=0; i--) {
			sb.append(word[i]+" "+word[i].length()+" ");
		}
		return sb.toString();
	}

}

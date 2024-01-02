package com.Code.Practice;

import java.util.Arrays;

public class Sort_String_Characters_Using_Java {

	public static void main(String[] args) {
	  // 1st Approach --- To Sort the String Using Sort Methods
	      String st = "kausar";
	      sortString(st);
	      
	      // 2nd approach to Sort the String ------- Using Sort Method
	      
	      sortStringWithSortMethod(st);
	}

	private static void sortStringWithSortMethod(String st) {
		// TODO Auto-generated method stub
		char[] ch = st.toCharArray();
		Arrays.sort(ch);
		
		System.out.println(new String(ch));
		
	}

	private static void sortString(String st) {
		char[] ch = st.toCharArray();
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch.length; j++) {
				if(ch[i]<ch[j]) {
					char temp= ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
				}
			}
		}
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println(new String(ch));
	}

}

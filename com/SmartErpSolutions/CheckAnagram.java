package com.SmartErpSolutions;

public class CheckAnagram {

	public static void main(String[] args) {
		String st1 = "kausar";
		String st2 = "rasuas";
		
		checkAnagram(st1, st2);
	}
     
	private static void checkAnagram(String st1, String st2) {
		boolean b = false;
		if(st1.length()==st2.length()) {
		   for(int i=0; i<st1.length(); i++) {
			   char ch1 = st1.charAt(i);
			   if(st2.contains(ch1+"")) {
				   b = true;
			   }else {
				   b = false;
			   }
		   }
		}else {
			b = false;
		}
		if(b) {
			System.out.println("It Is Anagram");
		}else {
			System.out.println("It is not Anagram");
		}
	}

}

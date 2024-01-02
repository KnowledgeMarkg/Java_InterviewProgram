package com.NoramalQuestions;

public class CheckVowelConsonantDigitSpeChar {

	public static void main(String[] args) {
		String str = "Java Programming!123";
		countVoCoSpeCharDigit(str);
	}

	private static void countVoCoSpeCharDigit(String str) {
	      int vCount = 0;
	      int cCount =0;
	      int dCount =0;
	      int speCharCount =0;
	      char ch;
	      for(int i=0; i<str.length(); i++) {
	    	  ch = str.charAt(i);
	    	  if(ch >= 'a' && ch <= 'z') {
	    		  if(ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
	    			  vCount++;
	    		  }else {
	    			  cCount++;
	    		  }
	    	  }else if(ch>= '0' && ch<= '9') {
	    		  dCount++;
	    	  }else {
	    		  speCharCount++;
	    	  }
	      }
	      System.out.println(cCount);
	      System.out.println(vCount);
	      System.out.println(dCount);
	      System.out.println(speCharCount);
	}

}

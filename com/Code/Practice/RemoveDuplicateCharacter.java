package com.Code.Practice;

import java.util.HashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
      String str = "Kausarraza";
      String newStr = removeduplicate(str);
      System.out.println("Old String: "+str +" after Remove Chatacter: "+newStr);
      
      // Call another methods
      
      String input = "programming";
      String output = removeDuplicates(input);
      
      System.out.println("Original string: " + input);
      System.out.println("String after removing duplicates: " + output);
	}

	private static String removeduplicate(String str) {
		 HashSet<Character> hs = new HashSet<Character>();
		 StringBuffer sb = new StringBuffer();
		 
		  for(Character ch : str.toCharArray()) {
			  if(!hs.contains(ch)) {
				  hs.add(ch);
				  sb.append(ch);
			  }
		  }
		return sb.toString();
	}
	
	// Another Methods .............................................
	
	public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters
        
        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                result.append(c);
                seen[c] = true;
            }
        }
        
        return result.toString();
    }

}

package com.String.kodnest;

public class CaesarCipherRotationByK {
	public static void main(String[] args) {
		String str = "middle-Outz";
		int k =2;
		String st = convertIntoCipher(str, k);
		System.out.println(st);
	}
	private static String convertIntoCipher(String s, int k) {
		 StringBuilder sb = new StringBuilder();
	        k = k%26;
	        for(int i=0; i<s.length(); i++) {
	          char ch = s.charAt(i);
	          if(Character.isUpperCase(ch)){
	              char newChar = (char) (ch+k);
	              if(newChar>90){
	                  newChar = (char) (newChar%90 +64);
	              }
	              sb.append(newChar);
	          }else if(Character.isLowerCase(ch)){
	              char newChar = (char) (ch+k);
	              if(newChar>122){
	                  newChar = (char) (newChar%122 +96);
	              }
	              sb.append(newChar);
	          }else{
	              sb.append(ch);
	          }
	        }
	     return sb.toString();
	}
}

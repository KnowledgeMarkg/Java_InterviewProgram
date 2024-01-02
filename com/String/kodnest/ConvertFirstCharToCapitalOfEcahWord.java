package com.String.kodnest;

public class ConvertFirstCharToCapitalOfEcahWord {

	public static void main(String[] args) {
		String str = "I am learning java with kodnest";
		convert1stCharCapital(str);
		anotherconvert1stCharCapital(str);
	}

	private static void anotherconvert1stCharCapital(String str) {
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(i==0) {
				if(Character.isLowerCase(ch[i])) {
					ch[i] = (char) (ch[i]-32);
				}
			}else if(ch[i]==' ') {
				i++;
				if(ch[i]>='a' && ch[i]<='z') {
					ch[i] = (char) (ch[i]-32);
				}
			}
		}
		String st = new String(ch);
		System.out.println("2nd Method "+st);
	}

	private static void convert1stCharCapital(String str) {
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String str1 :words) {
			sb.append(Character.toUpperCase(str1.charAt(0))+""+str1.substring(1)+" ");
		}
		System.out.println("1st Method "+sb);
	}
}

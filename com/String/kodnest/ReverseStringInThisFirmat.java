package com.String.kodnest;

public class ReverseStringInThisFirmat {

	public static void main(String[] args) {
		String str= "Java is fun";
//		revStr = "nufs ia vaJ";
		String str1 = "I am learning java";  //a va jgninrae lmaI
		reverseString(str);
		System.out.println();
		anotheReverseString(str1);
		System.out.println();
		kodnestClassReverseString(str1);
	}
	private static void kodnestClassReverseString(String str1) {
		char[] chArr = str1.toCharArray();
		char[] revArr = new char[chArr.length];
		str1=str1.replaceAll(" ", "");
		char[] charArr = str1.toCharArray();
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i]==' ') {
				revArr[i] = chArr[i];
			}
		}
		int j= charArr.length-1;
		for(int i=0; i<revArr.length; i++) {
			if(revArr[i]==' ') {
				i++;
			}
			revArr[i] = charArr[j];
			j--;
		}
		String str3 = new String(revArr);
		System.out.println(str3);
	}
	private static void anotheReverseString(String str) {
		String[] strArr = str.split(" ");
		str+=str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		int l = ch.length-1;
		for(String word : strArr) {
			for(int i=0 ; i<word.length(); i++) {
					System.out.print(ch[l]);
					l--;
			}
			System.out.print(" ");
		}
	}

	private static void reverseString(String str) {
		str= str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			 if(i==2 || i==4){
				System.out.print(" ");
				System.out.print(ch[i]);
			}else {
			System.out.print(ch[i]);
			}
		}
	}

}

package com.AgiraTech;

public class CheckReverseArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 1};
		String st = "";
		for(int i =0 ; i<arr.length; i++) {
			st+=arr[i];
		}
		String temp = st ; 
		String str = "";
		for(int i = st.length()-1; i>=0; i--) {
			str+=st.charAt(i);
		}
		
		System.out.println(st.equals(str));
	}

}

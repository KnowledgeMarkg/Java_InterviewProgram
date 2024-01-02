package com.SmartErpSolutions;

import java.util.Arrays;

public class DeleteElementFormArray {

	public static void main(String[] args) {
		int size = 6;
		int[] arr = new int[size];
		arr[0] = 4;
		arr[1] = 5;
		arr[2] = 6;
		arr[4] = 7;
		arr[5] = 8;
		int delteElm = 5;
		 int[] arrNew = removeElme(arr, delteElm);
		 System.out.println(Arrays.toString(arrNew));
	}

	private static int[] removeElme(int[] arr, int delteElm) {
		int[] newArr = new int[arr.length-1];
		int index = 0 ;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=delteElm) {
				newArr[index] = arr[i];
				index++;
			}
		}
		return newArr;
	}

}

package com.TapAcademy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LonelyIntegerHackerrank {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Size of An Array");
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			int num = findLonelyInteger(arr);
			System.out.println("lonely Integer in this "+Arrays.toString(arr)+" is " + num);
		}
	}

	private static int findLonelyInteger(int[] arr) {
	    HashSet<Integer> hs = new HashSet<>();
	    for(int i : arr) {
	    	if(hs.contains(i)) {
	    		hs.remove(i);
	    	}else {
	    		hs.add(i);
	    	}
	    }
	    int num =0;
	    for(int i : hs) {
	    	  num = i;
	    }
		return num;
	}

}

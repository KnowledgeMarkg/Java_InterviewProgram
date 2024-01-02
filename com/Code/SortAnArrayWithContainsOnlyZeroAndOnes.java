package com.Code;

import java.util.Arrays;

public class SortAnArrayWithContainsOnlyZeroAndOnes {

	public static void main(String[] args) {
		int[] binaryArray = {0, 1, 0, 1, 1, 0, 0, 1};
		System.out.println("Original Array: " + Arrays.toString(binaryArray));
		sortBinaryArray(binaryArray);
		System.out.println("Sorted Array: " + Arrays.toString(binaryArray));
	}

	private static void sortBinaryArray(int[] binaryArray) {
		int countZeros=0;
		for(int i : binaryArray) {
			if(i==0) {
				countZeros++;
			}
		}
		for(int i=0; i<binaryArray.length; i++) {
			if(i<countZeros) {
				binaryArray[i]=0;
			}else {
				binaryArray[i]=1;
			}
		}
	}

}

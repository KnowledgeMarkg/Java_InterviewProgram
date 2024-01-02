package arrays_Problems;

import java.util.Arrays;

public class ArraysSort_1 {

	public static void main(String[] args) {
		int[] arr = {1, 12, 8, 77,7,88,5};
		for(int i=0; i<arr.length-1 ;i++) {
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

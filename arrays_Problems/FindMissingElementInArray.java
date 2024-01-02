package arrays_Problems;

import java.util.Arrays;

public class FindMissingElementInArray {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,6};
		int l = arr.length+1;
		int sum = l * (l + 1) / 2;
		System.out.println(sum);
		int arrSum =0;
		for(Integer i : arr) {
			arrSum+=i;
		}
		System.out.println("Missing Element in this Array " +Arrays.toString(arr) + " is " +(sum-arrSum));
	}

}

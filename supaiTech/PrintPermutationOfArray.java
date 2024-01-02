package supaiTech;

import java.util.Arrays;
import java.util.Scanner;

public class PrintPermutationOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		printPermitation(arr, 0);
	}

	private static void printPermitation(int[] arr, int cele) {
		if(cele == arr.length-1) {
			System.out.println(Arrays.toString(arr));
		}else {
			for(int i=cele; i<arr.length; i++) {
				swap(arr, i, cele);
				printPermitation(arr, cele+1);
				swap(arr, i, cele);
			}
		}
		
	}

	private static void swap(int[] arr, int i, int cele) {
		int tem = arr[i];
		arr[i] = arr[cele];
		arr[cele] = tem;
	}

}

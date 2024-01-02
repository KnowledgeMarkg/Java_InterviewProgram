 package arrays_Problems;

public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] arr = {2,4,21,33,55,7, 88};
		for(int num : arr) {
			if(num <min ) {
				min = num;
			}else if(num > max ) {
				max = num;
			}
		}
		System.out.println("Minimum Number " +min);
		System.out.println("Maximum Number " +max);
	}

}

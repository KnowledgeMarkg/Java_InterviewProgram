package arrays_Problems;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,5,8,6,9,11,7};
		int secLa = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		for(int a :arr) {
			if(a > largest) {
				secLa = largest;
				largest = a;
			}else if(a > secLa || largest > secLa) {
					secLa = a;
				}
		}
		System.out.println(secLa);
		System.out.println(largest);
	}

}

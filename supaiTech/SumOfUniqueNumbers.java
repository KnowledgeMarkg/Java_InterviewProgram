package supaiTech;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SumOfUniqueNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number Seprated By comma");
		String st = sc.nextLine();
		
		String[] strArr = st.replaceAll("[\\[\\]]", "").split("\\s*,\\s*");
		
		int[] numArr = new int[strArr.length];
		
		try {
			for(int i=0; i<numArr.length; i++) {
				numArr[i] = Integer.parseInt(strArr[i]);
			}
			int count = sumOfUnique(numArr);
			System.out.println("The Sum of Unique Value is "+count +" in this Array " + Arrays.toString(numArr));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int sumOfUnique(int[] numArr) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i : numArr) {
			hs.add(i);
		}
		
		System.out.println("Uniques Array " +hs);
		int sum =0; 
		for(int unique : hs) {
			sum+=unique;
		}
		return sum;
	}
}

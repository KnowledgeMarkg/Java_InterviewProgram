package collections;

import java.util.Arrays;
import java.util.function.*;

public class PredicateInStream {

	public static void main(String[] args) {
		int[] arr = {0, 5, 10, 15, 20, 25, 30};
		Predicate<Integer> p1 = x1-> x1>10;
		Predicate<Integer> p2 = x2-> x2%2==0 && x2!=0;
		
		System.out.println("The Number greater Than 10 ");
		m1(p1, arr);
		System.out.println("Even number Is in Array "+Arrays.toString(arr));
		m1(p2, arr);
		System.out.println("The Number Which is Even And greater Than 10 is ");
		m1(p1.and(p2), arr);
		System.out.println("The Number which is Even or Greater Than 10");
		m1(p1.or(p2), arr);
		System.out.println("The Number Which is not Greater than 10");
		m1(p1.negate(), arr);
	}

	private static void m1(Predicate<Integer> p, int[] arr) {
		for(Integer i : arr) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
}

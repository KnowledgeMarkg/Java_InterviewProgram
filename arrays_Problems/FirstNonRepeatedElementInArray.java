package arrays_Problems;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedElementInArray {

	public static void main(String[] args) {
		Integer[] arr = { 3, 4, 6, 7, 2, 7, 1, 3, 4 };
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();

		for (Integer num : arr) {
			lhm.put(num, lhm.containsKey(num) ? lhm.get(num) + 1 : 1);
		}

		for (Entry<Integer, Integer> entry : lhm.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("1st Non Repeated Element :  " + entry.getKey());
				break;
			}
		}
	}

}

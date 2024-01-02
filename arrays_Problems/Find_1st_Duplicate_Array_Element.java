package arrays_Problems;

import java.util.HashSet;

public class Find_1st_Duplicate_Array_Element {

	public static void main(String[] args) {
		int[] array = { 3, 4, 6, 7, 2, 7, 1, 3 };
		boolean foundDuplicate = false;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("First duplicate element: " + array[i]);
					foundDuplicate = true;
					break; // Exit the program after finding the first duplicate
				}
			}
			if (foundDuplicate) {
				break;
			}
		}
		if (!foundDuplicate) {
			System.out.println("No duplicate element found.");
		}
		// ............................Other Methods ..........................

		int[] array1 = { 3, 4, 6, 7, 2, 7, 1, 3 };
		HashSet<Integer> seenElements = new HashSet<>();

		for (Integer num : array1) {
			if (seenElements.contains(num)) {
				System.out.println("First duplicate element by collection : " + num);
				break;
			} else {
				seenElements.add(num);
			}
		}
	}
}

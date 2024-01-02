package arrays_Problems;

import java.util.*;
import java.util.Map.Entry;

public class FindElementPresentAtLeastTwoArray_2 {

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,9,8,7};
		Integer[] arr2 = {4,1,2,10,15};
		Integer[] arr3 = {5,1,2,4,10};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(Integer num1 : arr1) {
			hm.put(num1, hm.containsKey(num1)? hm.get(num1)+1 : 1);
		}
		for (Integer integer : arr2) {
			hm.put(integer, hm.containsKey(integer)? hm.get(integer)+1 : 1);
		}
		for (Integer integer : arr3) {
			hm.put(integer, hm.containsKey(integer)? hm.get(integer)+1 : 1);
		}
		
		for(Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue() >=2) {
				System.out.println(entry.getKey());
			}
		}
	}
}

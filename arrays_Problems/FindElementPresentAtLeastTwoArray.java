package arrays_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindElementPresentAtLeastTwoArray {

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,9,8,7};
		Integer[] arr2 = {4,1,2,10,15};
		Integer[] arr3 = {5,1,2,4,10};
		
		ArrayList<Integer> arList1 = new ArrayList<Integer>(Arrays.asList(arr1));
		ArrayList<Integer> arList2 = new ArrayList<Integer>(Arrays.asList(arr2));
		ArrayList<Integer> arList3 = new ArrayList<Integer>(Arrays.asList(arr3));
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.addAll(arList1);
		hs.addAll(arList2);
		hs.addAll(arList3);
		
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		
		for(Integer num : hs) {
			if(arList1.contains(num) && arList2.contains(num) ||
					arList2.contains(num) && arList3.contains(num) ||
					arList2.contains(num) && arList3.contains(num) ) {
				finalList.add(num);
			}
		}
		System.out.println(finalList);
	}

}

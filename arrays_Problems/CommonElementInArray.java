package arrays_Problems;

import java.util.HashSet;

public class CommonElementInArray {

	public static void main(String[] args) {
		Integer[] arr1 = {2,3,1,6,4,8};
		Integer[] arr2 = {4,9,5,2,11,10,2};
		HashSet<Integer> hs = new HashSet<Integer>();
		//....................1st Method......................
		for(int i=0; i<arr1.length ;i++) {
			for(int j=0 ; j<arr2.length ; j++) {
				if(arr1[i]==arr2[j]) {
					hs.add(arr1[i]); // if arr1 or arr2 contains duplicate elements itself
				}
			}
		}
		for(Integer i : hs) {
			System.out.println(i);
		}
		
		//........................2nd Method................................
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		 
		for(Integer i : arr1 ){
			hs1.add(i);
		}
		for(Integer i1 : arr2) {
			hs2.add(i1);
		}
		
		for(Integer i3 : hs1) {
			if(hs2.contains(i3)) {
				System.out.print(i3+" ");
			}
		}
	}

}

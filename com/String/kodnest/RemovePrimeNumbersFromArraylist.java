package com.String.kodnest;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovePrimeNumbersFromArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arList = new ArrayList<>();
		arList.add(7);
		arList.add(18);
		arList.add(3);
		arList.add(14);
		arList.add(19);
		arList.add(32);
		arList.add(72);
		Iterator<Integer> it = arList.iterator();
		while(it.hasNext()) {
			if(it.next()%2 !=0) {
				it.remove();
			}
		}
		System.out.println(arList);
	}

}

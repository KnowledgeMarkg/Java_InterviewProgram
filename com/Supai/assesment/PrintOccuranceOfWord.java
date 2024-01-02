package com.Supai.assesment;


import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PrintOccuranceOfWord {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A Paragraph ");
			String st= sc.nextLine();
			st = st.toLowerCase();
			System.out.println("Enter A Number Either 0 or 1");
			int n = sc.nextInt();
			
			printOccurence(st, n);
		}
	}

	private static <T> void printOccurence(String st, int n) {
		String[] strArr = st.split("\\s+");
		String regex = "[a-zA-Z0-9]";
		st = st.replaceAll(regex, "");
		if(n==0) {
		 LinkedHashMap<String,Integer> lhmap = new LinkedHashMap<>();
		 for(String str : strArr) {
			
			 if(!lhmap.containsKey(str)) {
				 lhmap.put(str, 1);
			 }else {
				 lhmap.put(str, lhmap.get(str)+1);
			 }
		 }
		 
		 for(Map.Entry<String, Integer> entry : lhmap.entrySet()) {
			 System.out.println(entry.getKey() +"               " + entry.getValue());
		 }
		}else if(n==1) {
			HashMap<String, Integer> tmap = new HashMap<>();
			for(String str : strArr) {
				if(!tmap.containsKey(str)) {
					 tmap.put(str, 1);
				 }else {
					 tmap.put(str, tmap.get(str)+1);
				 }
			}
			Set<Entry<String, Integer>> list = tmap.entrySet();
			Comparator<T>comparator = new Comparator<T>() {

				@Override
				public int compare(T o1, T o2) {
					// TODO Auto-generated method stub
					return 0;
				}
			};
			
			
			for(Map.Entry<String, Integer> entry : tmap.entrySet()) {
				System.out.println(entry.getKey() +" " + entry.getValue());
				
			}
		}else {
			System.out.println("Please Enter 0 or 1");
		}
	}

}

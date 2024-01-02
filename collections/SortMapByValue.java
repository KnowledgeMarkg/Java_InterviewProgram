package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Paragraph");
		String st = sc.nextLine();
		System.out.println("Enter 0 or 1 ");
		int n = sc.nextInt();
		sortmapbyValur(st, n);
		sc.close();
	}

	private static void sortmapbyValur(String st, int n) {
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		st = st.toLowerCase();
		st = st.trim();
		String regex = "[^a-zA-Z0-9\\s]";
		st = st.replaceAll(regex, "");
		String[] arr = st.split(" ");
		for(String str : arr) {
			hashMap.put(str, hashMap.getOrDefault(str, 0)+1);
		}
//		hashMap.forEach((key, value)-> System.out.println(key+"\t"+value));
		
		if(n==0) {
			Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
			
			ArrayList<Entry<String, Integer>> list = new ArrayList<>(entrySet);
			
			Collections.sort(list, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));
			
			System.out.println("Assending Order");
			
			list.forEach((entry) -> System.out.println(String.format("%-10s %s", entry.getKey(), entry.getValue())));
			
		}else if(n==1) {
			Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
			
			ArrayList<Entry<String, Integer>> list = new ArrayList<>(entrySet);
			
			Collections.sort(list, (e1, e2)-> e2.getValue().compareTo(e1.getValue()));
			
			System.out.println("Desending Order ");
			
			list.forEach((entry) -> System.out.println(String.format("%-10s %s", entry.getKey(), entry.getValue())));
		}else {
			System.out.println("Enter 0 or 1");
		}
	}

}

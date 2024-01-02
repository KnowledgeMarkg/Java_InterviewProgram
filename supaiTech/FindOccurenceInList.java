package supaiTech;

import java.util.*;

public class FindOccurenceInList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> alist = new ArrayList<>(); 
		
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			alist.add(num);
		}
		
		printOccurence(alist);
	}

	private static void printOccurence(List<Integer> alist) {
		TreeMap<Integer, Integer> tmap = new TreeMap<>();
		
		for(Integer i : alist) {
			tmap.put(i, tmap.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> e : tmap.entrySet()) {
			System.out.println(e.getKey() +" : " +e.getValue());
		}
	}

}

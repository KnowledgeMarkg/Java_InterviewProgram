package collections;

import java.util.*;
import java.util.stream.Stream;

public class List_Into_Array {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(21);
		list.add(8);
		list.add(86);
		list.add(11);
		list.add(12);
		
		Integer[] array = list.stream().toArray(Integer[] :: new );
		System.err.println(Arrays.toString(array));
		
//		Stream<Integer> arrayStream = Stream.of(array);
//		arrayStream.forEach(System.out::println);
		
		Stream.of(array).forEach(System.out::println);
	}

}

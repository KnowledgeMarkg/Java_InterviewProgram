package arrays_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Convert_Array_To_ArrayList {

	public static void main(String[] args) {
	    String[] strarr = {"Kausar", "Pagal", "Adarsh"};
	    //convert Array to array list..................
	    
	    //List<String> aList = Arrays.asList(strarr);
	    //System.out.println(aList);
	    
	    ArrayList<String> al = new ArrayList<String>();
	    Collections.addAll(al, strarr);
	    al.add("Kausar Raza");
	    System.out.println(al);
	    
	    //................................................
	    Integer[] array = {1, 2, 3, 4, 5};

        // Convert array to ArrayList
        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));
            arrayList.add(6);
            System.out.println(arrayList);
          // Array element print...............................  
         Arrays.stream(array).forEach(System.out::println);
	    
	}
}

package arrays_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteArrayElement {

	public static void main(String[] args) {
		int[] arr = {1,2,54,32,36,47,43};
		int index = 2;
		//........................................1st Method
	    int[] newArr =  IntStream.range(0, arr.length).filter(i -> i!=index).map(i->arr[i]).toArray();
	    System.out.println(Arrays.toString(newArr));
	    
	    //.....................Another Method To Delete Array Elements
	    int[]  arrNew = new int[newArr.length-1];
	    int j=0;
	    for(int i =0 ; i<newArr.length ; i++) {
	    	if(i==index) {
	    		continue;
	    	}else {
	    		arrNew[j] = newArr[i];
	    		j++;
	    	}
	    }
	    System.out.println(Arrays.toString(arrNew));
	    
	    //......................................3rd Methods....................
	    String[] strArr = {"Kausar", "Pagal" , "Raza"};
	    
	    ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(strArr));
	    arrList.remove(1);
	    System.out.println(arrList);
	}
}

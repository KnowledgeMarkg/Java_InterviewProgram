package collections;

import java.util.function.Function;

public class FindNumberOfSpaceInString {

	public static void main(String[] args) {
		String st = "  TODO Auto generated method stub  ";
		Function<String, Integer> f = s1-> s1.length()- s1.replaceAll(" ", "").length();
		
		System.out.println(f.apply(st));
 
	}

}

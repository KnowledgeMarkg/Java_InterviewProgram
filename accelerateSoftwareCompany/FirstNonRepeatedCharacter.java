package accelerateSoftwareCompany;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String st = "aabbddssefefg";
	    char ch	=findFirstRepeatedChar(st);
	    System.out.println("1st repeated Char : "+ch);
	}

	private static char findFirstRepeatedChar(String st) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for(Character ch  : st.toCharArray()) {
			lhm.put(ch, lhm.containsKey(ch) ? lhm.get(ch)+1 : 1);
		}
		for(Entry<Character, Integer> entry : lhm.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return 0;
	}

}

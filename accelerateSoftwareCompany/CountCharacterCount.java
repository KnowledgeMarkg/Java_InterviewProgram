package accelerateSoftwareCompany;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CountCharacterCount {

	public static void main(String[] args) {
		String st= "Hello World !";
		st = st.replaceAll(" ", "");
		findCountCharacter(st.trim());
	}

	private static void findCountCharacter(String str) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for(Character ch : str.toCharArray()) {
			lhm.put(ch, lhm.containsKey(ch) ? lhm.get(ch)+1 : 1);
		}
		for(Entry<Character, Integer> entry : lhm.entrySet()) {
			System.out.println(entry.getKey()+ " : "+entry.getValue());
		}
	}

}

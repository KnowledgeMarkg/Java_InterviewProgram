package collections;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindPalindromeWordsFromSentence {

	public static void main(String[] args) {
		String st = "A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward. Examples of palindrome words include \"radar,\" \"level,\" \"deified,\" \"civic,\" and \"refer.\" Palindrome phrases can be longer, such as \"A man, a plan, a canal, Panama!\" which reads the same backward and forward when spaces and punctuation are ignored.\r\n"
				+ "";

		findPalindrome(st);
	}

	private static void findPalindrome(String st) {
		String regex = "[^a-zA-Z0-9\\s]";
		st = st.replaceAll(regex, "");
		String[] words = st.split("\\s+");
		Set<String> palindrome = Stream.of(words).filter(e -> {
			int i = 0, j = e.length() - 1;
			while (i < j) {
				if (e.charAt(i) != e.charAt(j)) {
					return false;
				}
				i++;
				j--;
			}
			return true;
		}).filter(word-> word.length()>1).collect(Collectors.toSet());

		System.out.println("Palindrome Words in given String");
		palindrome.forEach(System.out::println);
	}

}

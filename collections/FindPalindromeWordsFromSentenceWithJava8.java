package collections;

import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindPalindromeWordsFromSentenceWithJava8 {

	public static void main(String[] args) {
		String st = "A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward. Examples of palindrome words include \"radar,\" \"level,\" \"deified,\" \"civic,\" and \"refer.\" Palindrome phrases can be longer, such as \"A man, a plan, a canal, Panama!\" which reads the same backward and forward when spaces and punctuation are ignored.\r\n"
				+ "";

		findPalindrome(st);
	}

	private static void findPalindrome(String st) {
		String regex = "[^a-zA-Z0-9\\s]";
		st = st.replaceAll(regex, "");
		Predicate<String> isPalindrome = word -> word.equals(new StringBuilder(word).reverse().toString());
		
		Function<String, String> toLowerCase = String::toLowerCase;
		Set<String> palindromes = Stream.of(st.split("\\W+"))
				.map(toLowerCase)
				.filter(isPalindrome.and(word-> word.length()>1))
				.collect(Collectors.toSet());
		System.out.println("Palindrome String in Given Senetences ");
		palindromes.forEach(System.out::println);
	}
}

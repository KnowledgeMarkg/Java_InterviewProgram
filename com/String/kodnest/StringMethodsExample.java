package com.String.kodnest;

public class StringMethodsExample {
    public static void main(String[] args) {
        // 1. length()
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. charAt(int index)
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // 3. concat(String str)
        String concatStr = str.concat(" Welcome");
        System.out.println("Concatenated string: " + concatStr);

        // 4. equals(Object anotherObject)
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Is the string equal to 'Hello, World!'? " + isEqual);

        // 5. indexOf(int ch)
        int indexOfChar = str.indexOf('o');
        System.out.println("Index of 'o': " + indexOfChar);

        // 6. substring(int beginIndex)
        String subString = str.substring(7);
        System.out.println("Substring starting from index 7: " + subString);

        // 7. toUpperCase()
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        // 8. toLowerCase()
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);

        // 9. replace(char oldChar, char newChar)
        String replacedStr = str.replace('o', '0');
        System.out.println("String with 'o' replaced by '0': " + replacedStr);

        // 10. split(String regex)
        String[] splitArray = str.split(",");
        System.out.println("String split into an array: ");
        for (String s : splitArray) {
            System.out.println(s);
        }
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello'? " + startsWithHello);

        // 12. endsWith(String suffix)
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Ends with 'World!'? " + endsWithWorld);

        // 13. contains(CharSequence sequence)
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World'? " + containsWorld);

        // 14. trim()
        String stringWithSpaces = "   Trim me!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");

        // 15. equalsIgnoreCase(String anotherString)
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello, WORLD!");
        System.out.println("Is the string equal ignoring case? " + equalsIgnoreCase);

        // 16. indexOf(String str)
        int indexOfSubstring = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfSubstring);

        // 17. lastIndexOf(String str)
        int lastIndexOfSubstring = str.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndexOfSubstring);

        // 18. replaceAll(String regex, String replacement)
        String replacedAll = str.replaceAll("[, ]", "-");
        System.out.println("Commas and spaces replaced with hyphens: " + replacedAll);

        // 19. toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("String as a character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}

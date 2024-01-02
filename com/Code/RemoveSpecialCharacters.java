package com.Code;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String input = "Hello, @World! How's #java?";
        
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                result.append(c);
            }
        }
        
        System.out.println("Original String: " + input);
        System.out.println("String with Special Characters Removed: " + result.toString());
    }
}


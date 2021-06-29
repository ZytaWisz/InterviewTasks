package org.example;

public class ReverseString {

    public String reverseTheString(String textToReverse) {

        char[] chars = textToReverse.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);

        }
        return stringBuilder.toString();
    }
}

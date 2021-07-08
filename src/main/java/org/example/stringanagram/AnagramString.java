package org.example.stringanagram;

import java.util.Arrays;

public class AnagramString {

    public boolean checkItIsAnagram(String normal, String anagram) {

        if (normal.length() != anagram.length()) {
            return false;
        }
        char[] array1 = normal.toLowerCase().toCharArray();
        Arrays.sort(array1);
        char[] array2 = anagram.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}

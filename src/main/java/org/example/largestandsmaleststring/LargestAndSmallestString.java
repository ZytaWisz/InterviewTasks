package org.example.largestandsmaleststring;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class LargestAndSmallestString {
    private static String text = "I hate Mondays";

    public static void main(String[] args) {

        LargestAndSmallestString largestAndSmallestString = new LargestAndSmallestString();
        largestAndSmallestString.findSmallestAndLargestString(text);
        Map<String, String> stringMap = largestAndSmallestString.findSmallestAndLargestStringNextExample(text);
        largestAndSmallestString.printMapResult(stringMap);

    }

    public void findSmallestAndLargestString(String text) {

        String word = "", small = "", large = "";
        String[] words = new String[50];
        text = text + " ";
        int length = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word = word + text.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }
        small = large = words[0];
        for (int j = 0; j < length; j++) {
            if (small.length() > words[j].length()) {
                small = words[j];
            }
            if (large.length() < words[j].length()) {
                large = words[j];
            }
        }
        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);
    }

    public Map<String, String> findSmallestAndLargestStringNextExample(String text) {
        String s = "";
        String smallestWord = "smallestWord";
        String largestWord = "largestWord";
        Map<String, String> stringMap = new HashMap<>();

        StringTokenizer stringTokenizer = new StringTokenizer(text, " ");
        while (stringTokenizer.hasMoreTokens()) {
            s = (stringTokenizer.nextToken());
            if (stringMap.get(smallestWord) == null || stringMap.get(smallestWord).length() > s.length()) {
                stringMap.put(smallestWord, s);
            }
            if (stringMap.get(largestWord) == null || stringMap.get(largestWord).length() < s.length()) {
                stringMap.put(largestWord, s);
            }
        }
        return stringMap;
    }

    public void printMapResult(Map<String, String> stringMap) {
        for (Map.Entry entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " is: " + entry.getValue());
        }
    }
}

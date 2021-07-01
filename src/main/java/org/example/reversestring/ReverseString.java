package org.example.reversestring;

public class ReverseString {


    public static void main(String[] args) {

        System.out.println(new ReverseString().reverseTheString("Ala ma kota"));
    }

    public String reverseTheString(String textToReverse) {

        char[] chars = textToReverse.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);

        }
        return stringBuilder.toString();
    }
}

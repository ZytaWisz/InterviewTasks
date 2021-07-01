package org.example.palindrom;

import java.util.Scanner;

public class PalindromeExample {


    public static void main(String[] args) {

    PalindromeExample palindromeExample=new PalindromeExample();

        if ( palindromeExample.checkIfItPalindrome()){
            System.out.println("The given text it is a palindrome");
        }else {
            System.out.println("The given text is not a palindrome");
        }

    }
    public boolean checkIfItPalindrome() {
        String reverse = "";
         boolean itIsPalindrome = false;
        String textOriginal = getTextFromUser();

        int length = textOriginal.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse+textOriginal.charAt(i);
            if (textOriginal.equals(reverse)) {
                itIsPalindrome = true;
            }
        }
        return itIsPalindrome;
    }

    public String getTextFromUser() {
        String textOriginal;
        System.out.println("Add text to check if it is palindrome: ");
        Scanner scanner = new Scanner(System.in);
        textOriginal = scanner.nextLine();
        return textOriginal;
    }
}

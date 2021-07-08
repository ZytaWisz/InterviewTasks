package org.example.reversenumber;

public class ReverseNumber {

    public int reverseNumber(int number) {
        int reverse=0;
        int remainder;
        while(number>0){
            remainder=number%10;
            reverse=(reverse*10)+remainder;
            number=number/10;
        }
        return reverse;
    }
}

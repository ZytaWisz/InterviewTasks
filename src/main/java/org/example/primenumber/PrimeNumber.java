package org.example.primenumber;

import java.util.Scanner;

public class PrimeNumber {

    private int number;

    public static void main(String[] args) {

        PrimeNumber primeNumber = new PrimeNumber();
        if (primeNumber.isPrime()) {
            System.out.println("Podana liczba jest liczbą pierwszą");
        } else {
            System.out.println("Podana liczba nie jest liczbą pierwszą");
        }
    }

    public boolean isPrime() {
         number = getNumberFromUser();

        boolean itIsPrime = true;
        if (number <= 1) {
            itIsPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    itIsPrime = false;
                    break;
                }
            }
        }
        return itIsPrime;
    }

    private int getNumberFromUser() {
        System.out.println("Podaj liczbę:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        return number;
    }

}

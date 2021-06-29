package org.example;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println(new ReverseString().reverseTheString("Ala ma kota"));

        System.out.println("===============================================");

        PrimeNumber primeNumber=new PrimeNumber();
        if (primeNumber.isPrime()){
            System.out.println("Podana liczba jest liczbą pierwszą");
        }else {
            System.out.println("Podana liczba nie jest liczbą pierwszą");
        }

    }

}

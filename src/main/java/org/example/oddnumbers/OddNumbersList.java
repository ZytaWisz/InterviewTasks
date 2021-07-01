package org.example.oddnumbers;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersList {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1,3,15,19);

        OddNumbersList oddNumbersList = new OddNumbersList();
        if (oddNumbersList.checkIfListHasOnlyOddNumbers(integers)) {
            System.out.println(" Lista: " + integers + " zawiera tylko liczby nieparzyste");
        } else {
            System.out.println("Lista: " + integers + " zawiera liczby parzyste");
        }
    }

    public boolean checkIfListHasOnlyOddNumbers(List<Integer> numberList) {
        boolean itIsOddNumbers = true;
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) % 2 == 0) {
                 itIsOddNumbers = false;

            }
        }
        return itIsOddNumbers;
    }
}

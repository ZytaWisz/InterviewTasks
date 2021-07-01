package org.example.oddnumbers;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersList {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>(List.of(9, 3, 1, 7, 11));

        OddNumbersList oddNumbersList = new OddNumbersList();
        if (oddNumbersList.checkIfListHasOnlyOddNumbers(integers)) {
            System.out.println(" Lista: " + integers + " zawiera tylko liczby nieparzyste");
        } else {
            System.out.println("Lista: " + integers + " zawiera liczby parzyste");
        }
    }

    public boolean checkIfListHasOnlyOddNumbers(List<Integer> numberList) {
        boolean itIsOddNumbers = false;
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) % 2 == 0) {
                 itIsOddNumbers = false;

            }
        }
        return true;
    }
}

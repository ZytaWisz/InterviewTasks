package org.example.subtractingnumberinarray;

import java.util.Arrays;

public class SubtractingNumber {

    public static void main(String[] args) {

        int[] array = new int[]{8, 10, 19, 2, 3, 5};
        System.out.println(new SubtractingNumber().subtractNearestNumber(array));


    }

    public int subtractNearestNumber(int[] array) {
        int n=0;
        int minusResult = 0;
        if (array.length >= 1) {
            Arrays.sort(array);
            minusResult=array[1]-array[0];
            for (int i = 2; i <n; i++) {
                minusResult = (array[i] - array[i - 1]);
            }
        }
        return minusResult;
    }
}

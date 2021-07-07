package org.example.arraycomparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Array comparing.
 *
 * @author Zyta Wiszniewska
 */
public class ArrayComparing {

    public static void main(String[] args) {

        Object[] array1 = new Object[]{1, 2, 3, 4};
        Object[] array2 = new Object[]{1, 2, 3, 4};
        Object[] arrayString1 = new Object[]{"ala", "kasia", "Monika"};
        Object[] arrayString2 = new Object[]{"kasia", "ala", "Monika"};

        boolean isEquals = new ArrayComparing().isArraysEqual(array1, array2);
        boolean isEqualsStringArrays = new ArrayComparing().compareArraysWithDifferentOrder(arrayString1, arrayString2);

        getResultComparingArrays(isEquals);
        getResultComparingArrays(isEqualsStringArrays);

    }

    public static void getResultComparingArrays(boolean isEquals) {
        if (isEquals) {
            System.out.println("The arrays is equals");
        } else {
            System.out.println("The arrays isn't equals");
        }
    }


    /**
     * Method checks if arrays is equal. Return true if all arrays elements are equals in this same order
     *
     * @param array1 the array 1
     * @param array2 the array 2
     * @return the boolean
     */
    public boolean isArraysEqual(Object[] array1, Object[] array2) {

        if (array1 == null || array2 == null) {
            System.out.println("Arrays can't be null");
            return false;
        }

        return Arrays.equals(array1, array2);
    }

    public boolean compareArraysWithDifferentOrder(Object[] array1, Object[] array2) {
        if (array1 == null || array2 == null) {
            System.out.println("Arrays can't be null");
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        } else {
            Arrays.sort(array1);
            Arrays.sort(array2);
        }

        return Arrays.equals(array1, array2);
    }

    public boolean compareArrayWithHasSameElements(Object[] array1, Object[] array2) {
        Set<Object> targetSet1 = new HashSet<Object>();
        Collections.addAll(targetSet1, array1);
        Set<Object> targetSet2 = new HashSet<Object>();
        Collections.addAll(targetSet2, array2);
        if (array1==null || array2==null){
            System.out.println("Arrays can't be null");
            return false;
        }

        return targetSet1.equals(targetSet2);
    }
}

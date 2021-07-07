package org.example.arraycomparing;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayComparingTest {

    private static final ArrayComparing arrayComparing = new ArrayComparing();

    @Test
    public void shouldReturnTrueIfArraysHasTheSameElements() {

        //given
        Object[] array1 = new Object[]{1, 2, 3, 4};
        Object[] array2 = new Object[]{1, 2, 3, 3, 4, 4};
        //when
        boolean expected = arrayComparing.compareArrayWithHasSameElements(array1, array2);
        //than
        assertTrue(expected);
    }

    @Test
    public void shouldReturnFalseIfArraysHasNotTheSameElements() {

        //given
        Object[] array1 = new Object[]{1, 2, 3, 4};
        Object[] array2 = new Object[]{1, 2, 3, 3, 4, 5, 6, 4};
        //when
        boolean expected = arrayComparing.compareArrayWithHasSameElements(array1, array2);
        //than
        assertFalse(expected);
    }

    @Test
    public void shouldReturnFalseIfArrayIsNull() {

        //given
        Object[] array1 = new Object[]{};
        Object[] array2 = new Object[]{1, 2, 3, 3, 4, 5, 6, 4};
        //when
        boolean expected = arrayComparing.compareArrayWithHasSameElements(array1, array2);
        //than
        assertFalse(expected);
    }

    @Test
    public void shouldReturnTrueIfArraysHasDifferentOrderWithElements() {

        //given
        Object[] array1 = new Object[]{1, 2, 3, 4};
        Object[] array2 = new Object[]{3, 1, 4, 3, 3, 4, 2};
        //when
        boolean expected = arrayComparing.compareArrayWithHasSameElements(array1, array2);
        //than
        assertTrue(expected);

    }
}

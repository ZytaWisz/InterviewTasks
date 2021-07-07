package org.example.arraycomparing;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ArrayComparingTest {

    private static final ArrayComparing arrayComparing = new ArrayComparing();

    @Test
    public void shouldReturnTrueIfArraysHasTheSameElements() {

        //given
        Object[] array1 = new Object[]{1, 2, 3, 4};
        Object[] array2 = new Object[]{1, 2, 3, 3, 4, 4};

        boolean expected = arrayComparing.compareArrayWithHasSameElements(array1, array2);

        assertTrue(expected);


    }
}
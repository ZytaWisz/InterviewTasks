package org.example.duplicateinarray;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuplicateInArrayTest {

    DuplicateInArray duplicateInArray=new DuplicateInArray();

    @Test
    public void shouldReturnArrayWithoutDuplicates(){
        Integer[] array=new Integer[]{1,1,2,2,3,3,4,4,5,5,6,6};
        Integer[] expectedArray=new Integer[]{1,2,3,4,5,6};

        Integer [] actualArray=duplicateInArray.removeDuplicatesFromArray(array);

        assertThat(actualArray).containsExactlyInAnyOrder(expectedArray);

    }

}
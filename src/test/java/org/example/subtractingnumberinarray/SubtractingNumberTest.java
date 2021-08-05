package org.example.subtractingnumberinarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SubtractingNumberTest {
    SubtractingNumber subtractingNumber=new SubtractingNumber();

    @Test
    void shouldReturnSubtractNearestNumber() {
        int[] array = new int[]{8, 10, 19, 2, 3, 5};
        int actual=subtractingNumber.subtractNearestNumber(array);
        int expected=1;
        assertThat(actual).isEqualTo(expected);
    }
}
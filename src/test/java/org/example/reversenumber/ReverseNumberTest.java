package org.example.reversenumber;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ReverseNumberTest {

    ReverseNumber reverseNumber = new ReverseNumber();

    @Test
    public void shouldReturnReverseNumber() {
        int number = 543;
        int reverse = 345;

        int actual = reverseNumber.reverseNumber(number);

        assertThat(actual).isEqualTo(reverse);


    }
}
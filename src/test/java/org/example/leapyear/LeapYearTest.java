package org.example.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class LeapYearTest {
    LeapYear leapYear=new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960,
            1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020 })
    void shouldReturnTrueIfIsLeapYear(int year) {

        boolean actual=leapYear.checkItIsLeapYear(year);
        assertThat(actual).isEqualTo(true);
    }


}
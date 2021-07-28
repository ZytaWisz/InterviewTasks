package org.example.largestandsmaleststring;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LargestAndSmallestStringTest {

    @Test
    void shouldReturnSmallestAndLargestString() {

        Map<String, String>stringMap=Map.of("smallestWord", "I", "largestWord", "Mondays");

        Map<String, String>actualResult=new LargestAndSmallestString().
                findSmallestAndLargestStringNextExample("I hate Mondays");

        assertThat(actualResult).containsAllEntriesOf(stringMap);
    }
}
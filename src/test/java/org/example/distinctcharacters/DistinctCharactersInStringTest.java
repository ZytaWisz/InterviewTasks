package org.example.distinctcharacters;


import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctCharactersInStringTest {
    DistinctCharactersInString distinctCharactersInString = new DistinctCharactersInString();

    @Test
    public void shouldReturnDistinctOfCharactersAndCountThem() {
        String testString = "ala";
        Map<Character, Integer> result = Map.of('a', 2, 'l', 1);

        assertEquals(result, distinctCharactersInString.getDistinctOfCharacters(testString));
    }

    @Test
    public void shouldReturnDistinctOfCharactersAndCountThemWithjCopmpute() {
        String testString = "alabala";
        Map<Character, Integer> result = Map.of('a', 4, 'b',1, 'l',2);


        assertThat(distinctCharactersInString.getDistinctOfCharactersWithCompute(testString)).containsExactlyInAnyOrderEntriesOf(result);
    }

}
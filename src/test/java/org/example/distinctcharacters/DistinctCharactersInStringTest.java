package org.example.distinctcharacters;

import org.assertj.core.api.MapAssert;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class DistinctCharactersInStringTest {
    DistinctCharactersInString distinctCharactersInString = new DistinctCharactersInString();

    @Test
    public void shouldReturnDistinctOfCharactersAndCountThem() {
        String testString = "ala";
        Map<Character, Integer> result = Map.of('a', 2, 'l', 1);

        Assert.assertEquals(result, distinctCharactersInString.getDistinctOfCharacters(testString));
    }

    @Test
    public void shouldReturnDistinctOfCharactersAndCountThemWithjCopmpute() {
        String testString = "alabala";
        Map<Character, Integer> result = Map.of('a', 4, 'b',1, 'l',2);


        assertThat(distinctCharactersInString.getDistinctOfCharactersWithCompute(testString)).containsExactlyInAnyOrderEntriesOf(result);
    }

}
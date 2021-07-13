package org.example.stringanagram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class AnagramStringTest {
    AnagramString anagramString = new AnagramString();
@Test
    public void shouldReturnTrueIfIsAnagramString() {
        String normal = "keep me awake%";
        String anagram = "%peek kawe mea";

        Boolean actual = anagramString.checkItIsAnagram(normal, anagram);

        assertThat(actual).isEqualTo(true);
    }

}
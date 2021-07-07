package org.example.distinctcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class DistinctCharactersInString {


    public Map<Character, Integer> getDistinctOfCharacters(String text) {

        Map<Character, Integer> stringMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Integer temp = stringMap.get(text.charAt(i));
            if (temp == null) {
                stringMap.put(text.charAt(i), 1);
            } else {
                stringMap.put(text.charAt(i), stringMap.get(text.charAt(i)) + 1);
            }
        }
        return stringMap;
    }

    public Map<Character, Integer> getDistinctOfCharactersWithCompute(String text) {

        Map<Character, AtomicInteger> stringMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            AtomicInteger temp = stringMap.get(text.charAt(i));
            stringMap.computeIfAbsent(text.charAt(i), character -> new AtomicInteger(0)).incrementAndGet();
        }
        return stringMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().intValue()));
    }

}

package org.example.duplicateinarray;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {


    public Integer[] removeDuplicatesFromArray(Integer[]array) {
        Set<Integer> set  = new HashSet<Integer>();
        Collections.addAll(set, array);

        return set.toArray(new Integer[0]);
    }
}

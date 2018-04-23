package com.epam.java.pdp.oca.thirdlesson;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public List<String> removeDuplicates(List<String> words) {
        List<String> listStr = words;
        int size = listStr.size();
        int duplicates = 0;


        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {
                if (!listStr.get(j).equals(listStr.get(i)))
                    continue;
                duplicates++;
                listStr.remove(j);
                j--;
                size--;
            } // for j
        } // for i
//TODO: Reimplement with using map ( try string builder)
        return listStr;
    }

    public List<String> removeDuplicatesWithStream(List<String> words) {
        List<String> listStr = words;
        listStr = listStr.stream()
                .distinct()
                .collect(Collectors.toList());
        return listStr;
    }

    public List<String> removeDuplicatesWithSet(List<String> words) {
        List<String> listStr = words;
        Set<String> hs = new HashSet<>();
        hs.addAll(listStr);
        listStr.clear();
        listStr.addAll(hs);
        return listStr;
    }
    public String[] removeDuplicatesFromArray(String[] words) {
        List<String> listStr = new LinkedList<>(Arrays.asList(words));
        listStr = removeDuplicatesWithSet(listStr);
        String[] result = new String[listStr.size()];
        return listStr.toArray(result);

    }
}


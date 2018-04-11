package com.epam.java.pdp.oca.thirdlesson;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

        return listStr;
    }

    public String[] removeDuplicatesFromArray(String[] words) {
        List<String> listStr = new LinkedList<String>(Arrays.asList(words));
        listStr = removeDuplicates(listStr);
        String[] result = new String[listStr.size()];
        return listStr.toArray(result);

    }
}


package com.epam.java.pdp.oca.thirdlesson;

import java.util.List;

public class FilterStringValues {

    public List<String> filterValues(List<String> words, List<String> values) {
        List<String> listStr = words;
        List<String> filteredValues =values;
        int sizeList = listStr.size();
        int sizeValues =filteredValues.size();

        for (int i = 0; i < sizeList; i++) {

            for (int j = 0; j < sizeValues; j++) {
                System.out.println("i="+i+" j="+j);
                if (!listStr.get(i).equals(filteredValues.get(j)))
                    continue;
                listStr.remove(i);
//                                sizeList--;
            } // for j4
        } // for i

        return listStr;
    }

}

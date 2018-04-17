package com.epam.java.pdp.oca.thirdlesson;

import java.util.Collection;
import java.util.List;

public class FilterStringValues {

    public List<String> filterValues(List<String> listToFilter, List<String> elementsToRemove) {
        listToFilter.removeAll(elementsToRemove);
        return listToFilter;
    }

}

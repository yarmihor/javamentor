package com.epam.java.pdp.oca.thirdlesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TransformUtility {

    private static Map<String, String> mapData;
    static {
        mapData= createMapData();
    }

    private int count;
    private static int countAll;


    public String transformWord(String world) {

        String replacement = mapData.get(world);
        count++;
        countAll++;
        return replacement;
    }

//TODO:Return count of run all instances

    private static Map<String,String> createMapData() {
        Map<String,String> dataCollection = new HashMap<>();
        dataCollection.put("Hi","John");
        dataCollection.put("Hello","Jack");
        dataCollection.put("Greeting","Mr. Mike");
        dataCollection.put("Bye","John");
        dataCollection.put("Good Luck","Evelina");
        dataCollection.put("Regards","Ivan");
        System.out.println("Creating MapData");
        return dataCollection;

    }

    public int countOfInvocation() {
         return count;
    }

    public int countOfAllInvocation() {
        return countAll;
    }
}

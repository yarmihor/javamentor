package com.epam.java.pdp.oca.secondlesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMinWord {

    public List<String> readDataFromConsoleToList() {

        List<String> myList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int i = 1;
        String word;
        System.out.println("Start add data , if you would like to finish. Please write " + "\"exit\"");
        do {
            System.out.println("Please insert " + i + " word.");
            word = in.next();
            if (word.equalsIgnoreCase("exit")) {
                if (myList.isEmpty()) {
                    System.out.println("Please input at least one element");
                } else {
                    System.out.println("Adding words completed");
                }
                continue;
            }
            myList.add(word);
            i++;
        } while (!word.equalsIgnoreCase("exit") || myList.isEmpty());
        return myList;
    }

    public String[] readDataFromConsoleToArray() {
        List<String> listStr = readDataFromConsoleToList();
        String[] result = new String[listStr.size()];
        return listStr.toArray(result);
    }

    public String findMinStringWord(String[] words) {
        String first = words[0];
        int minLength = first.length();
        String minString = null;
        for (String s : words) {
            if (s.length() <= minLength) {
                minLength = s.length();
                minString = s;
            }
        }
        return minString;
    }

    public String findMinStringWordWithVarArg(String... words) {
        String first = words[0];
        int minLength = first.length();
        String minString = null;
        for (String s : words) {
            if (s.length() <= minLength) {
                minLength = s.length();
                minString = s;
            }
        }
        return minString;
    }

    public String findMinStringWord(List<String> words) {
        String first = words.get(0);
        int minLength = first.length();
        String minString = null;
        for (String s : words) {
            if (s.length() <= minLength) {
                minLength = s.length();
                minString = s;
            }
        }
        return minString;
    }


}
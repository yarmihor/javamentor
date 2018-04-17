package com.epam.java.pdp.oca.thirdlesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReplaceString {

    public String replaceStringWorld(String world) {

        switch (world) {
            case "Hi":
                return "John";
            case "Hello":
                return "Jack";
            case "Greeting":
                return "Mr. Mike";
            case "Bye":
                return "John";
            case "Good Luck":
                return "Evelina";
            case "Regards":
                return "Ivan";
            default:
                System.out.println("Incorrect value. " +
                        "Please choose appropriate from the list");
        }
//        TODO: Implement using MAP (use initialization blocks)
        return null;
    }

    public Map<String,String> readDataFromConsoleToList() {

        Map<String,String> myListWords = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int i = 1;
        String key,value;
        System.out.println("Start add data , if you would like to finish. Please write " + "\"exit\"");
        do {
            System.out.println("Please insert key in the  " + i + " pair.");
            key = in.next();
            if (key.equalsIgnoreCase("exit")) {
                if (myListWords.isEmpty()) {
                    System.out.println("Please input at least one element");
                } else {
                    System.out.println("Adding words completed");
                }
                continue;
            }
            System.out.println("Please insert value in the " + i + " pair.");
            value = in.next();
            myListWords.put(key,value);
            i++;
        } while (!key.equalsIgnoreCase("exit") || myListWords.isEmpty());
//        System.out.println("Adding words completed");
        return myListWords;
    }
}

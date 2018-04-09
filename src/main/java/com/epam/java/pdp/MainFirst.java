package com.epam.java.pdp;

import com.epam.java.pdp.oca.secondlesson.FindMinWord;

import java.util.List;
import java.util.Scanner;

public class MainFirst {

    public  static void main(String[] args) {


        FindMinWord findMin= new FindMinWord();
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose method: List - '1', Array - '2', Vararg - '3'");
        String chooseMethod = in.next();

        switch (chooseMethod) {
            case "1":
                final List<String> words = findMin.readDataFromConsoleToList();
                String minWord = findMin.findMinStringWord(words);
               System.out.format("min string from list: '%s'\n", minWord);
                break;
            case "2":
                final String[] words2 = findMin.readDataFromConsoleToArray();
                String minWord2 = findMin.findMinStringWord(words2);
                System.out.format("min string from array: '%s'\n", minWord2);
                break;
            case "3":
                final String[] words3 = findMin.readDataFromConsoleToArray();
                String minWord3 = findMin.findMinStringWordWithVarArg(words3);
                System.out.format("min string from array with vararg: '%s'\n", minWord3);
                break;
            default:
                System.out.println("Incorrect value. " +
                        "Please choose appropriate from the list");
                break;
        }
    }

}

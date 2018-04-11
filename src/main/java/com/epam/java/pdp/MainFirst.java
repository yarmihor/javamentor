package com.epam.java.pdp;

import com.epam.java.pdp.oca.secondlesson.FindMinWord;
import com.epam.java.pdp.oca.thirdlesson.FilterStringValues;
import com.epam.java.pdp.oca.thirdlesson.RemoveDuplicates;
import com.epam.java.pdp.oca.thirdlesson.ReplaceString;

import java.util.List;
import java.util.Scanner;

public class MainFirst {

    public  static void main(String[] args) {


        FindMinWord findMin= new FindMinWord();
        RemoveDuplicates remove= new RemoveDuplicates();
        FilterStringValues filtering = new FilterStringValues();
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose method: List - '1', Array - '2', Vararg - '3',  Filtering- '4', Replace -'5'");
        String chooseMethod = in.next();

        switch (chooseMethod) {
            case "1":
                final List<String> words = findMin.readDataFromConsoleToList();
                List<String> minWordWithoutDuplicates;
                minWordWithoutDuplicates = remove.removeDuplicates(words);
                String minWord = findMin.findMinStringWord(minWordWithoutDuplicates);
               System.out.format("min string from list: '%s'\n", minWord);
                break;
            case "2":
                final String[] words2 = findMin.readDataFromConsoleToArray();
                String minWord2 = findMin.findMinStringWord(remove.removeDuplicatesFromArray(words2));
                System.out.format("min string from array: '%s'\n", minWord2);
                break;
            case "3":
                final String[] words3 = findMin.readDataFromConsoleToArray();
                String minWord3 = findMin.findMinStringWordWithVarArg(words3);
                System.out.format("min string from array with vararg: '%s'\n", minWord3);
                break;
            case "4":
                final List<String> words4 = findMin.readDataFromConsoleToList();
                final List<String> filterValue = findMin.readDataFromConsoleToList();
                List<String> filterWords = filtering.filterValues(words4,filterValue);
                String filteredList = findMin.findMinStringWord(filterWords);
                System.out.format("min string from list: '%s'\n", filteredList);
                break;
            case "5":
                System.out.println("Please choose word from the list: Hi,Hello,Greeting,Bye,Good Luck,Regards");
                String world = in.next();
                ReplaceString replace = new ReplaceString();
                world = replace.ReplaceStringWorld(world);
                System.out.println(world);
                break;
            default:
                System.out.println("Incorrect value. " +
                        "Please choose appropriate from the list");
                break;
        }
    }

}

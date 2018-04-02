package com.epam.java.pdp;

import com.epam.java.pdp.oca.secondlesson.FindMinWord;

import java.util.List;
import java.util.Scanner;

public class MainFirst {

    public  static void main(String[] args) {


        FindMinWord findMin= new FindMinWord();
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose method: List - '1', Array - '2', Vararg - '3'");
        String choose_method = in.next();

        switch (choose_method) {
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
        }
    }

//    private static void max(int a, int b, int c, int d) {
//
//        int max = a;
//
//        if (b > max)
//            max = b;
//        if (c > max)
//            max = c;
//        if (d > max)
//            max = d;
//        System.out.println("Max value "+max);
//        }
//
//    private static void evenNumbersWhile (){
//        int e = 100;
//        while ( 1 <= e ) {
//               if (e % 2==0) {
//                System.out.print(" " + e);
//            }
//            e = e - 1;
//        }
//    }
//    private static void evenNumbersFor (){
//        int i;
//        int e = 100;
//        for (i=1;i<=e;) {
//            if (i % 2==0) {
//                System.out.println(" " + i);
//            }
//            i = ++i;
//        }
//    }
//
//    private static void evenNumbersDoWhile (){
//        int e = 100;
//        do  {
//            if (e % 2==0) {
//                System.out.print(" " + e);
//            }
//            e = e - 1;
//        } while (1<=e);
//    }

}

package com.epam.java.pdp;

import oca.SecondLesson;

import java.util.Arrays;
import java.util.List;

public class MainFirst {

    public static void main(String[] args) {
        Integer a,b,c,d;
        a=1;
        b=2;
        c=3;
        d=4;
        max(a,b,c,d);
       evenNumbersWhile();
       evenNumbersFor();
        evenNumbersDoWhile ();
        System.out.println("hh");

        String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
        List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");

        String minString = SecondLesson.getMinString(toppings);
        System.out.format("min string: '%s'\n", minString);
        String minString2 = SecondLesson.getMinString2(messages);
        System.out.format("min string: '%s'\n", minString2);

    }

    private static void max(int a, int b, int c, int d) {

        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        System.out.println("Max value "+max);
        }

    private static void evenNumbersWhile (){
        int e = 100;
        while ( 1 <= e ) {
               if (e % 2==0) {
                System.out.print(" " + e);
            }
            e = e - 1;
        }
    }
    private static void evenNumbersFor (){
        int i;
        int e = 100;
        for (i=1;i<=e;) {
            if (i % 2==0) {
                System.out.println(" " + i);
            }
            i = ++i;
        }
    }

    private static void evenNumbersDoWhile (){
        int e = 100;
        do  {
            if (e % 2==0) {
                System.out.print(" " + e);
            }
            e = e - 1;
        } while (1<=e);
    }

}

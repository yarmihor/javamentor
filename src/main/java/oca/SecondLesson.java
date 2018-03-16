package oca;

import java.util.Arrays;
import java.util.List;

public class SecondLesson {

    public static void findMin() {
        System.out.println("findMin");
    }

    public static String getMinString(String[] array) {
        String first = array[0];
        int minLength = first.length();
        String minString = null;
        for (String s : array) {
            if (s.length() <= minLength) {
                minLength = s.length();
                minString = s;
            }
        }
        return minString;
    }
    public static String getMinString2(List<String> array) {
        String first = array.get(0);
        int minLength = first.length();
        String minString = null;
        for (String s : array) {
            if (s.length() <= minLength) {
                minLength = s.length();
                minString = s;
            }
        }
        return minString;
    }
}

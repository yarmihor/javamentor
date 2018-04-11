package com.epam.java.pdp.oca.thirdlesson;

import java.util.List;

public class ReplaceString {

    public String ReplaceStringWorld (String world){
        String name = null;
        switch (world){
            case "Hi":
                name="John";
                break;
            case "Hello":
                name="Jack";
                break;
            case "Greeting":
                name="Mr. Mike";
                break;
            case "Bye":
                name="John";
                break;
            case "Good Luck":
                name="Evelina";
                break;
            case "Regards":
                name="Ivan";
                break;
            default:
                System.out.println("Incorrect value. " +
                        "Please choose appropriate from the list");
                break;
        }

        return name;
    }
}

package com.epam.java.pdp.oca.thirdlesson;

public class TransformUtilityMain {

    public static void main(String[] args) {
       TransformUtility replace= new TransformUtility();
        System.out.println(replace.transformWord("Hi"));

        System.out.println(replace.transformWord("Hello"));
        System.out.println(replace.transformWord("Hi"));

        System.out.println("Number of invocations per instance replace"+replace.countOfInvocation());

        TransformUtility transform = new TransformUtility();
        System.out.println(transform.transformWord("Hi"));
        System.out.println(transform.transformWord("Hello"));
        System.out.println("Number of invocations  per instance tranform"+transform.countOfInvocation());
        System.out.println("Number of invocations  per ALL instances "+transform.countOfAllInvocation());


    }
}

package com.company;

import java.util.List;
import java.util.ArrayList;

public class ExceptionHandling {
    public static void main(String[] args) {

        int[] n = { 5, 2, 4, 5, 6, 7, 2 };

        System.out.format("The last element in the array is %d%n", n[n.length]);
        // java ArrayIndexOutOfBoundsEx.java
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7
        // out of bounds for length 7
        // at com.zetcode.ArrayIndexOutOfBoundsEx.main(ArrayIndexOutOfBoundsEx.java:9)

        var words = List.of("sky", "blue", "forest", "lake", "river");
        // An immutable list is created with List.of() factory method. The immutable
        // list does not support the add()
        // method; therefore, we the UnsupportedOperationException is thrown when we run
        // the example.
        words.add("ocean");

        System.out.println(words);

        List<String> words1 = new ArrayList<>() {
            {
                add("sky");
                add("blue");
                add("cloud");
                add(null);
                add("ocean");
            }
        };

        words1.forEach(word -> {
            System.out.printf("The %s word has %d letters%n", word, word.length());
        });

        // The example loops over a list of strings and determines the length of each of
        // the strings. Calling length() on a null value leads to NullPointerException.
        // To fix this, we either remove all null values from the list of check for a
        // null value before calling length().
    }
}

public class JavaTester {
    public void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Not Eligible for voting");
        else
            System.out.println("Eligible for voting");
    }

    public static void main(String args[]) {
        JavaTester obj = new JavaTester();
        obj.checkAge(13);
        System.out.println("End Of Program");
    }
}
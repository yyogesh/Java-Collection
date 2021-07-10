package com.company;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
    // HashSet is a collection that contains no duplicate elements. This class
    // offers constant time performance for the basic operations
    // (add, remove, contains, and size). HashSet does not provide ordering of
    // elements.
    public static void main(String[] args) {
        Set<String> brands = new HashSet<>();

        brands.add("Pepsi");
        brands.add("Amazon");
        brands.add("Volvo");
        brands.add("IBM");
        brands.add("IBM");

        System.out.println(brands);

        System.out.println(brands.isEmpty());
        System.out.println(brands.contains("Volvo"));
        brands.remove("Volvo");
        System.out.println(brands.contains("Volvo"));

        brands.clear();
        System.out.println(brands);
    }
}

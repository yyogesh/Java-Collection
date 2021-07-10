package com.company;

import java.util.HashSet;
import java.util.Set;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
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

        Map<String, Integer> wordCount = new HashMap<>();

        String fileName = "D:\\Ysquare\\Java\\HashSetExample3\\src\\com\\company\\test.txt";

        List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

        for (String line : lines) {
            String[] words = line.split("\\s+");

            for (String word : words) {
                if (word.endsWith(".") || word.endsWith(",")) {
                    word = word.substring(0, word.length() - 1);
                }

                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }

        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }

    }
}

package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // HashMap is a container that stores key/value pairs. Each key is associated
        // with one value. Keys must be unique.
        // This container type is called an associative array or a
        // dictionary in other programming languages. HashMaps take more memory because
        // for each value there is also a key.

        Map<String, String> domains = new HashMap<>();

        domains.put("de", "Germany");
        domains.put("sk", "Slovakia");
        domains.put("us", "United States");
        domains.put("ru", "Russia");
        domains.put("hu", "Hungary");
        domains.put("pl", "Poland");

        System.out.println(domains.get("pl"));

        for (String item : domains.values()) {

            System.out.println(item);
        }

        Set keys = domains.keySet(); // The keySet() method returns the keys of the HashMap in a Set collection. A
                                     // Set is a collection of unique elements.

        System.out.println(keys);

        // Poland
        // Germany
        // Slovakia
        // Hungary
        // Poland
        // United States
        // Russia
        // [de, sk, hu, pl, us, ru]

        Map<Integer, Colour> cols = new HashMap<>();

        cols.put(1, new Colour("AliceBlue", "#f0f8ff"));
        cols.put(2, new Colour("GreenYellow", "#adff2f"));
        cols.put(3, new Colour("IndianRed", "#cd5c5c"));
        cols.put(4, new Colour("khaki", "#f0e68c"));

        System.out.printf("The size of the map is %d%n", cols.size());

        int key = 4;

        if (cols.containsKey(key)) {

            System.out.printf("The map contains key %d%n", key);
        }

        cols.remove(1);

        System.out.printf("The size of the map is %d%n", cols.size());

        cols.replace(3, new Colour("VioletRed", "#d02090"));

        Colour col = cols.get(3);

        System.out.printf("Colour name:%s colour code:%s %n", col.getName(), col.getCode());
    }
}

class Colour {

    private String name;
    private String code;

    public Colour(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // create an ArrayList
        ArrayList<String> city_List = new ArrayList<String>(
                Arrays.asList("Delhi", "Mumbai", "Chennai", "Kolkata", "Pune", "Hyderabad"));
        // print the list
        System.out.println("Initial ArrayList:" + city_List);

        // remove element at index 2
        city_List.remove(2);
        // print the list
        System.out.println("\nArrayList after removing element at index 2:" + city_List);

        // remove the element "Kolkata"
        city_List.remove("Kolkata");
        // print the list
        System.out.println("\nArrayList after removing element -> Kolkata:" + city_List);

        // create new list
        ArrayList<String> newCities = new ArrayList<String>(Arrays.asList("Delhi", "Hyderabad"));
        // call removeAll to remove elements contained in newCities list.
        city_List.removeAll(newCities);
        // print the list
        System.out.println("\nArrayList after call to removeAll:" + city_List);

        ArrayList<Integer> evenList = new ArrayList<Integer>(5);
        System.out.println("Initial size: " + evenList.size());
        evenList.add(2);
        evenList.add(4);
        evenList.add(6);
        evenList.add(8);
        evenList.add(10);

        // print the list and size
        System.out.println("Original List: " + evenList);
        System.out.println("ArrayList Size after add operation: " + evenList.size());
        // call ensureCapacity () with minimum capacity =10
        evenList.ensureCapacity(10);
        // Add two more elements
        evenList.add(12);
        evenList.add(14);
        System.out.println("ArrayList Size after ensureCapacity() call and add operation: " + evenList.size());

        evenList.trimToSize();
        System.out.println("ArrayList Size after trimToSize() operation: " + evenList.size());

        ArrayList<String> colorsList = new ArrayList<String>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("White");

        // call contains method to check if different strings are present in ArrayList
        System.out.println("ArrayList contains ('Red Green'): " + colorsList.contains("Red Green"));
        System.out.println("ArrayList contains ('Blue'): " + colorsList.contains("Blue"));
        System.out.println("ArrayList contains ('Yellow'): " + colorsList.contains("Yellow"));
        System.out.println("ArrayList contains ('White'): " + colorsList.contains("White"));

        colorsList.set(2, "Yellow");
        System.out.println("Entry at index 2 after call to set: " + colorsList.get(2));

        colorsList.clear();
        // check if ArrayList is empty using isEmpty() method
        System.out.println("Is ArrayList empty after clear ()? :" + colorsList.isEmpty());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(5);
        intList.add(3);
        intList.add(2);
        intList.add(1);
        intList.add(1);

        // print the ArrayList
        System.out.println("The ArrayList: " + intList);
        // call indexOf() and lastIndexOf() methods to check the indices of specified
        // elements
        System.out.println("indexOf(1) : " + intList.indexOf(1));
        System.out.println("lastIndexOf(1) : " + intList.lastIndexOf(1));
        System.out.println("indexOf(2) : " + intList.indexOf(2));
        System.out.println("lastIndexOf(2) : " + intList.lastIndexOf(2));
        System.out.println("indexOf(3) : " + intList.indexOf(3));
        System.out.println("lastIndexOf(3) : " + intList.lastIndexOf(3));
        System.out.println("indexOf(5) : " + intList.indexOf(5));
        System.out.println("lastIndexOf(5) : " + intList.lastIndexOf(5));

        Integer myArray[] = new Integer[intList.size()];

        myArray = intList.toArray(myArray);

        System.out.println("Array from ArrayList:" + Arrays.toString(myArray));

        ArrayList<String> fruitsList = new ArrayList<String>();

        // Adding elements to the ArrayList
        fruitsList.add("Apple");
        fruitsList.add("Orange");
        fruitsList.add("Melon");
        fruitsList.add("Grapes");
        System.out.println("Original ArrayList: " + fruitsList);

        ArrayList<String> clone_list = (ArrayList<String>) fruitsList.clone();
        System.out.println("Cloned ArrayList: " + clone_list);

        fruitsList.add("Mango");
        fruitsList.remove("Orange");

        // print original and cloned ArrayList again
        System.out.println("\nOriginal ArrayList after add & remove:" + fruitsList);
        System.out.println("Cloned ArrayList after original changed:" + clone_list);

        ArrayList<Integer> sub_ArrayList = new ArrayList<Integer>(intList.subList(2, 6));
        // print the sublist
        System.out.println("Sublist of given ArrayList: " + sub_ArrayList);

        ArrayList<String> colorsList2 = new ArrayList<String>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Yellow");

        // print the ArrayList
        System.out.println("Original ArrayList:" + colorsList2);

        // define another collection
        ArrayList<String> color_collection = new ArrayList<String>();
        color_collection.add("Red");
        color_collection.add("Blue");
        System.out.println("Collection elements to be retained in the list:" + color_collection);

        // call retainAll method with above collection as an argument
        colorsList.retainAll(color_collection);
        // print the ArrayList after retainAll call.
        System.out.println("ArrayList after retainAll call:" + colorsList);

        // create an ArrayList
        ArrayList<String> city_List2 = new ArrayList<String>();
        // add elements to the ArrayList using add method
        city_List2.add("Delhi");
        city_List2.add("Mumbai");
        city_List2.add("Chennai");
        city_List2.add("Kolkata");

        // print ArrayList
        System.out.println("\nInitial ArrayList :" + city_List2);
        // define an array.
        String[] myArray2 = new String[] { "Cochin", "Goa" };

        Collections.addAll(city_List2, myArray2);
        // print the ArrayList
        System.out.println("\nArrayList after adding array :" + city_List2);

        // Create and initialize an ArrayList
        ArrayList<String> colorsList3 = new ArrayList<String>();
        colorsList3.add("Red");
        colorsList3.add("Green");
        colorsList3.add("Blue");
        colorsList3.add("Yellow");

        // print initial ArrayList
        System.out.println("Initial ArrayList:" + colorsList3);

        // sort ArrayList in ascending order
        Collections.sort(colorsList3);
        // Collections.reverse(colorsList3);

        // print sorted ArrayList
        System.out.println("\nArrayList sorted in ascending order:");
        System.out.println(colorsList3);

        // sort ArrayList in reverse(desending) order
        Collections.sort(colorsList3, Collections.reverseOrder());

        // print sorted list
        System.out.println("\nArrayList sorted in descending order:");
        System.out.println(colorsList3);

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 3, 5, 6, 6, 7, 7, 8));
        // print the original ArrayList
        System.out.println("Original ArrayList:" + numList);

        // Use 8 stream().distinct()
        List<Integer> distnicList = numList.stream().distinct().collect(Collectors.toList());

        // print the new list
        System.out.println("ArrayList without duplicates:" + distnicList);

        // HashSet<Student> students = new HashSet<Student>();
        //
        // students.add(new Student("s1", ""))
    }
}

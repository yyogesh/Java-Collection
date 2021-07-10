package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(1);
        intList.add(4);

        System.out.println("----- Before Sorting -----");

        intList.forEach(System.out::println);

        Collections.sort(intList);
        intList.forEach(System.out::println);

        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(new Student("s3", 103));
        studentArrayList.add(new Student("s1", 101));
        studentArrayList.add(new Student("s2", 102));
        studentArrayList.add(new Student("s4", 104));

        System.out.println("----- Before Sorting -----");
        studentArrayList.forEach(System.out::println);

        Collections.sort(studentArrayList);

        System.out.println("----- After Sorting -----");
        studentArrayList.forEach(System.out::println);

    }
}

class Student implements Comparable<Student> {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollNo='" + rollNo + '\'' + '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.getRollNo() > student.getRollNo()) {
            return 1; // any positive number
        } else {
            return -1;
        }
    }
}

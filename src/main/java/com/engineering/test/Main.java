package com.engineering.test;

public class Main {

    public static void main(String[] args) {
        String name = "Milos";
        printEachLetter(name);
        name = "Janko";
        printEachLetter(name);
    }

    private static void printEachLetter(String value) {
        value.chars().forEach(i -> System.out.println((char)i));
        System.out.println("\n");
    }
}

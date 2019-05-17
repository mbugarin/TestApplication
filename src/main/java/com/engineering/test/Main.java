package com.engineering.test;

public class Main {

    public static void main(String[] args) {
        String name = "Milos";
        printEachLetter(name);
        name = "Janko";
        printEachLetter(name);
    }

    private static void printEachLetter(String value) {
        for (char c : value.toCharArray()) {
            System.out.println(c);
        }
        System.out.println("\n");
    }
}

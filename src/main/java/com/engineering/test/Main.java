package com.engineering.test;

public class Main {

    public static void main(String[] args) {
        String name = "Milos";
        printEachLetter(name);
        name = "Janko";
        printEachLetter(name);
        
        int numeroUno = 22;
        int numeroDue = 55;

        System.out.println(String.format("Sum of numbers %d and %d is %d", numeroUno, numeroDue, sumNumbers(numeroUno, numeroDue)));
    }

    private static long sumNumbers(int num1, int num2) {
        return num1 + num2;
    }

    private static void printEachLetter(String value) {
        for (char c : value.toCharArray()) {
            System.out.println(c);
        }
        System.out.println("\n");
    }
}

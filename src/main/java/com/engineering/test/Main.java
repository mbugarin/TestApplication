package com.engineering.test;

public class Main {

    public static void main(String[] args) {
        String name = "Milos";
        name.chars().forEach(i -> System.out.println((char)i));

        int numeroUno = 22;
        int numeroDue = 55;

        System.out.println(String.format("Sum of numbers %d and %d is %d", numeroUno, numeroDue, sumNumbers(numeroUno, numeroDue)));
    }

    private static long sumNumbers(int num1, int num2) {
        return num1 + num2;
    }
}

package com.company;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> generateArrayOfDigits(int value) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (value > 0) {
            digits.add(0, value % 10);
            value /= 10;
        }
        return digits;
    }

    public static int getValueWithMaxDigitsCount(int a, int b) {
        ArrayList<Integer> aDigits = generateArrayOfDigits(a);
        ArrayList<Integer> bDigits = generateArrayOfDigits(b);
        return (aDigits.size() > bDigits.size()) ? a : b;
    }

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = 123415;
        System.out.println(a);
        System.out.println(b);
        System.out.println(getValueWithMaxDigitsCount(a, b));
    }
}

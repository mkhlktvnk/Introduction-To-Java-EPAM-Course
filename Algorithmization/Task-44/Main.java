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

    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;
        System.out.println(generateArrayOfDigits(value));
    }
}

package com.company;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Byte> generateArrayOfDigits(int value) {
        ArrayList<Byte> digits = new ArrayList<>();
        while (value > 0) {
            digits.add(0, (byte) (value % 10));
            value /= 10;
        }
        return digits;
    }

    static int getDigitsSum(int value) {
        return generateArrayOfDigits(value).stream().mapToInt((a) -> a).sum();
    }

    public static int getIterationsCount(int value) {
        int iterations = 0;
        while (value > 0) {
            value -= getDigitsSum(value);
            iterations++;
        }
        return iterations;
    }

    public static void main(String[] args) {
        int value = 123;
        System.out.println(getIterationsCount(value));
    }
}

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

    public static boolean isIncreasingSequenceOfDigits(int value) {
        ArrayList<Integer> digits = generateArrayOfDigits(value);
        return digits.stream().sorted().toList().equals(digits);
    }

    public static ArrayList<Integer> getAllNumbersWithIncreasingSequenceOfDigits(int lowerBound, int upperBound) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isIncreasingSequenceOfDigits(i)) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(getAllNumbersWithIncreasingSequenceOfDigits(100, 200));
    }
}

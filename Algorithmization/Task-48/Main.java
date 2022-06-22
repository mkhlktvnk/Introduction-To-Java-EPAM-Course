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

    public static boolean isArmstrongNumber(int number) {
        ArrayList<Integer> digits = generateArrayOfDigits(number);
        int n = digits.size();
        int sum = digits.stream().mapToInt((a) -> a).sum();
        return Math.pow(sum, n) == number;
    }

    public static ArrayList<Integer> getAllArmstrongNumbersInRange(int lowerBound, int upperBound) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrongNumber(i)) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(getAllArmstrongNumbersInRange(1, 10000));
    }
}

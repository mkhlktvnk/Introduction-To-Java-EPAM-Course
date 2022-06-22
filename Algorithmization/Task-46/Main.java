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

    public static ArrayList<Integer> getValuesWithSumOfDigitsEqualsTo(int value, int range) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i <= range; i++) {
            int sum = generateArrayOfDigits(i).stream().mapToInt((element) -> element).sum();
            if (sum == value) {
                values.add(i);
            }
        }
        return values;
    }

    public static void main(String[] args) {
        int k = 6;
        int n = 60;
        System.out.println(getValuesWithSumOfDigitsEqualsTo(k, n));
    }
}

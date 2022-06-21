package com.company;

import java.util.ArrayList;

public class Main {
    public static int getFactorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public static ArrayList<Integer> getAllOddValuesInRange(int lowerBound, int upperBound) {
        ArrayList<Integer> oddValues = new ArrayList<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 != 0) {
                oddValues.add(i);
            }
        }
        return oddValues;
    }

    public static int getFactorialSum(ArrayList<Integer> values) {
        int sum = 0;
        for (Integer value : values) {
            sum += getFactorial(value);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> oddValues = getAllOddValuesInRange(1, 9);
        System.out.println(getFactorialSum(oddValues));
    }
}

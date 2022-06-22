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

    public static boolean containsOnlyOddNumbers(int value) {
        ArrayList<Byte> digits = generateArrayOfDigits(value);
        return digits.stream().filter((a) -> a % 2 != 0).toList().size() == digits.size();
    }

    public static ArrayList<Integer> getNDigitNumbersWithOnlyOddDigits(int n) {
        int lowerBound = (int) (Math.pow(10, n - 2) * 10);
        int higherBound = (int) Math.pow(10, n);
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = lowerBound; i <= higherBound; i++) {
            if (containsOnlyOddNumbers(i)) {
                values.add(i);
            }
        }
        return values;
    }

    public static int getNumbersSum(ArrayList<Integer> numbers) {
        return numbers.stream().mapToInt((a) -> a).sum();
    }

    public static int getEvenDigitsCount(int value) {
        ArrayList<Byte> digits = generateArrayOfDigits(value);
        return (int) digits.stream().filter(a -> a % 2 == 0).mapToInt(a -> a).count();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = getNDigitNumbersWithOnlyOddDigits(5);
        int sum = getNumbersSum(numbers);
        System.out.println(numbers);
        System.out.println(sum);
        System.out.println(getEvenDigitsCount(sum));
    }
}

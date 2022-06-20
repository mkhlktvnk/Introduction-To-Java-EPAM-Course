package com.company;

public class Main {
    public static long getGreatestCommonDivisor(long a, long b) {
        return b == 0 ? a : getGreatestCommonDivisor(b, a % b);
    }

    public static long getLeastCommonDenominator(long a, long b) {
        return (a * b) / getGreatestCommonDivisor(a, b);
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(2, 3));
        System.out.println(getGreatestCommonDivisor(3, 2));
        System.out.println(getGreatestCommonDivisor(3, 9));
        System.out.println(getGreatestCommonDivisor(6, 12));
        System.out.println(getLeastCommonDenominator(2, 3));
        System.out.println(getLeastCommonDenominator(3, 2));
        System.out.println(getLeastCommonDenominator(3, 9));
        System.out.println(getLeastCommonDenominator(6, 12));
    }
}

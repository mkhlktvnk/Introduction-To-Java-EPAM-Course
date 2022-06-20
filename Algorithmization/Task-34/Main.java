package com.company;

import java.util.*;

public class Main {
    public static ArrayList<Fraction> generateRandomFractionsArrayList(int size) {
        ArrayList<Fraction> fractions = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            long n = 1 + random.nextLong(10);
            long d = n + random.nextLong(15);
            fractions.add(new Fraction(n, d));
        }
        return fractions;
    }

    public static long getGreatestCommonDivisor(long a, long b) {
        long temp = 0;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        ArrayList<Fraction> fractions = generateRandomFractionsArrayList(10);
        System.out.println(fractions);

        long leastCommonDenominator = fractions
                .stream()
                .mapToLong(Fraction::getDenominator)
                .reduce(1, (d1, d2) -> d1 * d2 / getGreatestCommonDivisor(d1, d2));

        fractions.forEach(fraction -> fraction.setLeastCommonDenominator(leastCommonDenominator));

        fractions.sort(Comparator.comparingLong(Fraction::getNumerator));
        System.out.println(fractions);
    }
}

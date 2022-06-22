package com.company;

import java.util.HashMap;

public class Main {
    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static HashMap<Integer, Integer> findAllTwinPairsInRange(int lowerBound, int upperBound) {
        HashMap<Integer, Integer> twinPairs = new HashMap<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                twinPairs.put(i, i + 2);
            }
        }
        return twinPairs;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(findAllTwinPairsInRange(n, 2 * n));
    }
}

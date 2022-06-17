package com.company;

import java.util.*;

public class Main {
    public static Integer getMostRecurring(Integer[] array) {
        HashMap<Integer, Integer> results = new HashMap<>();
        int counter = 0;
        for (Integer i : array) {
            for (Integer j : array) {
                if (Objects.equals(i, j)) {
                    counter++;
                }
            }
            results.put(i, counter);
            counter = 0;
        }
        Integer max = Collections.max(results.values());
        return results
                .entrySet()
                .stream()
                .filter(entry -> max.equals(entry.getValue()))
                .map(Map.Entry::getKey).findFirst().get();
    }


    public static void main(String[] args) {
        Integer[] array = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6, 11 };
        System.out.println(Arrays.toString(array));
        System.out.println(getMostRecurring(array));
    }
}

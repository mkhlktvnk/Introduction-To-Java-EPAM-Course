package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = -1000 + random.nextInt(2000);
        }
        return array;
    }

    public static void sortByExchange(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = generateRandomArray(10);
        sortByExchange(array);
        System.out.println(Arrays.toString(array));
    }
}

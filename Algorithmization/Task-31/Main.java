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

    public static void sortByInserts(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = generateRandomArray(10);
        sortByInserts(array);
        System.out.println(Arrays.toString(array));
    }
}

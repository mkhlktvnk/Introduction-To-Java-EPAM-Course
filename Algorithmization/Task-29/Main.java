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

    public static void sortBySelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int position = i;
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    position = j;
                    max = array[j];
                }
            }
            array[position] = array[i];
            array[i] = max;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = generateRandomArray(10 + random.nextInt(20));
        sortBySelection(array);
        System.out.println(Arrays.toString(array));
    }
}

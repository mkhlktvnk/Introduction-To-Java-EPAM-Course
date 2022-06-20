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

    public static void sortByShell(int[] array) {
        int i, j, step;
        int tmp;
        for (step = array.length / 2; step > 0; step /= 2) {
            for (i = step; i < array.length; i++) {
                tmp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < array[j - step]) {
                        array[j] = array[j - step];
                    } else {
                        break;
                    }
                }
                array[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = generateRandomArray(10);
        sortByShell(array);
        System.out.println(Arrays.toString(array));
    }
}

package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static void sortIncrease(int[] array) {
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

    public static int[] merge(int[] first, int[] second) {
        int i, j, k;
        i = j = k = 0;
        int[] newArray = new int[first.length + second.length];

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                newArray[k++] = first[i++];
            } else {
                newArray[k++] = second[j++];
            }
        }
        while (i < first.length) {
            newArray[k++] = first[i++];
        }
        while (j < second.length) {
            newArray[k++] = second[j++];
        }
        return newArray;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] first = generateRandomArray(10 + random.nextInt(5));
        int[] second = generateRandomArray(10 + random.nextInt(10));
        sortIncrease(first);
        sortIncrease(second);
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(merge(first, second)));
    }
}

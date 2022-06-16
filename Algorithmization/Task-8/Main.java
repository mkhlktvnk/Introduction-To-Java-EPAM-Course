package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        int n = (int) (1 + Math.random() * 11);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(-100 + Math.random() * 1000);
        }
        return array;
    }
    
    public static int getMin(int[] array) {
        int min = array[0];
        for (int item : array) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public static ArrayList<Integer> generateNewSequence(int[] array) {
        ArrayList<Integer> newSequence = new ArrayList<>();
        int min = getMin(array);
        for (int item : array) {
            if (item != min) {
                newSequence.add(item);
            }
        }
        return newSequence;
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray();
        System.out.println(Arrays.toString(array));
        System.out.println(generateNewSequence(array));
    }
}

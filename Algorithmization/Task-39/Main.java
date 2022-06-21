package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = -100 + random.nextInt(200);
        }
        return array;
    }

    public static int findSecondLargest(int[] array) {
        int largest = array[0];
        int secondLargest = array[1];
        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest) {
                secondLargest = element;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray(15);
        System.out.println(Arrays.toString(array));
        System.out.println(findSecondLargest(array));
    }
}

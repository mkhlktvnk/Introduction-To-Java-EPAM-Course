package com.company;

public class Main {
    public static int[] generateRandomArray() {
        int n = (int) (1 + Math.random() * 11);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(-100 + Math.random() * 1000);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int getMaxOfNeighboringElementsSum(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        int max = array[0] + array[1];
        for (int i = 2; i + 1 < array.length; i++) {
            if (array[i] + array[i+1] > max) {
                max = array[i] + array[i + 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray();
        printArray(array);
        System.out.println(getMaxOfNeighboringElementsSum(array));
    }
}

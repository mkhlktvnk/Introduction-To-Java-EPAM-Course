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

    public static int getMaxElementIndex(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int getMinElementIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void changeMinAndMax(int[] array) {
        int minIndex = getMinElementIndex(array);
        int maxIndex = getMaxElementIndex(array);
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray();
        printArray(array);
        changeMinAndMax(array);
        printArray(array);
    }
}

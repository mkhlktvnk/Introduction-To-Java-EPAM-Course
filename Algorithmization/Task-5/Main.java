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
  
    public static void printElementsGreaterThanValue(int[] array, int value) {
        for (int item : array) {
            if (item > value) {
                System.out.print(item + " ");
            }
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray();
        int value = (int) (-100 + Math.random() * 1000);
        printArray(array);
        System.out.println("Value = " + value);
        printElementsGreaterThanValue(array, value);
    }
}

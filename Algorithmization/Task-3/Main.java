package com.company;

public class Main {
    public static int[] generateRandomArray() {
        int n = (int) (1 + Math.random() * 31);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(-100 + Math.random() * 1000);
        }
        return array;
    }

    public static int countPositive(int[] array) {
        int counter = 0;
        for (int item : array) {
            if (item > 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countZeros(int[] array) {
        int counter = 0;
        for (int item : array) {
            if (item == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countNegative(int[] array) {
        int counter = 0;
        for (int item : array) {
            if (item < 0) {
                counter++;
            }
        }
        return counter;
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
        System.out.println("Positive: " + countPositive(array));
        System.out.println("Zeros: " + countZeros(array));
        System.out.println("Negative: " + countNegative(array));
    }
}

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

    public static boolean isPrime(int value) {
        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getSumOfValuesWithPrimeIndex(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray();
        printArray(array);
        System.out.println("Sum = " + getSumOfValuesWithPrimeIndex(array));
    }
}

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int[] generateRandomArray() {
        int n = (int) (1 + Math.random() * 31);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(1 + Math.random() * 1000);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }

    public static int findSum(int[] array, int k) {
        int sum = 0;
        for (int item : array) {
            if (item % k == 0) {
                sum += item;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = generateRandomArray();
        int k = 0;
        try {
            System.out.print("k = ");
            k = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
        }
        printArray(array);
        System.out.println("Sum: " + findSum(array, k));
    }
}

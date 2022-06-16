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

    public static int changeValues(int[] array, int z) {
        int replacements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                replacements++;
            }
        }
        return replacements;
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = generateRandomArray();
        int z = 0;
        try {
            System.out.print("z = ");
            z = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        printArray(array);
        System.out.println("Replacements: " + changeValues(array, z));
        printArray(array);
    }
}

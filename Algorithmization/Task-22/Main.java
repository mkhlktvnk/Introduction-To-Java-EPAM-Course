package com.company;

import java.util.*;

public class Main {
    public static int[][] generateMatrix() {
        Random random = new Random();
        int rows = 10 + random.nextInt(20);
        int columns = 10 + random.nextInt(20);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 + random.nextInt(20);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
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

    public static void sortDecrease(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }

    public static void sortMatrixRowsIncrease(int[][] matrix) {
        for (int[] row : matrix) {
            sortIncrease(row);
        }
    }

    public static void sortMatrixRowsDecrease(int[][] matrix) {
        for (int[] row : matrix) {
            sortDecrease(row);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        printMatrix(matrix);
        System.out.println();
        sortMatrixRowsIncrease(matrix);
        printMatrix(matrix);
        System.out.println();
        sortMatrixRowsDecrease(matrix);
        printMatrix(matrix);
     }
}

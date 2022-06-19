package com.company;

import java.util.*;

public class Main {
    public static int[][] generateMatrix() {
        Random random = new Random();
        int rows = 4 + random.nextInt((8 - 4) / 2) * 2;
        int columns = 4 + random.nextInt((8 - 4) / 2) * 2;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 + random.nextInt(99 / 10) * 2;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] getSumsOfAllColumns(int[][] matrix) {
        int[] sums = new int [matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sums[i] += matrix[j][i];
            }
        }
        return sums;
    }

    public static int getMaxElementIndex(int[] array) {
        int max = array[0];
        int maxElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        printMatrix(matrix);
        int[] sums = getSumsOfAllColumns(matrix);
        int index = getMaxElementIndex(sums);
        System.out.println("\n" + Arrays.toString(sums) + " - sums of all columns.");
        System.out.printf("Column with max sum is number %d\n", index + 1);
     }
}

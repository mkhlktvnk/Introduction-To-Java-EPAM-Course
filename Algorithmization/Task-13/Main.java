package com.company;

import java.util.*;

public class Main {
    public static int[][] generateRandomMatrix() {
        int n = (int) (Math.random() * 5) + 3;
        int m = (int) (Math.random() * 5) + 3;
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printRow(int[][] matrix, int index) {
        System.out.println(Arrays.toString(matrix[index]));
    }

    public static void printColumn(int[][] matrix, int index) {
        for (int[] ints : matrix) {
            System.out.print(ints[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix();
        printMatrix(matrix);
        System.out.println();
        int k = (int) (Math.random() * matrix.length);
        int p = (int) (Math.random() * matrix[0].length);
        System.out.println("k = " + k + ", p = " + p);
        printRow(matrix, k);
        printColumn(matrix, p);
    }
}

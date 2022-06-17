package com.company;

import java.util.*;

public class Main {
    public static int[][] generateRandomMatrix() {
        int n = (int) (Math.random() * 5) + 3;
        int[][] matrix = new int[n][n];

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

    public static void printDiagonalElements(int[][] matrix) {
        System.out.print("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.print("\nSecondary diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - i - 1] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix();
        printMatrix(matrix);
        System.out.println();
        printDiagonalElements(matrix);
    }
}

package com.company;

import java.util.*;

public class Main {
    public static int[][] generateRandomMatrix() {
        Random random = new Random();
        int n = 4 + random.nextInt((10 - 4) / 2) * 2;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                matrix[i][j] = i + 1;
            }
            for (int j = matrix[i].length - i; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix();
        printMatrix(matrix);
        System.out.println();
    }
}

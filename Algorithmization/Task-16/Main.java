package com.company;

import java.util.*;

public class Main {
    public static int[][] generateMatrix() {
        Random random = new Random();
        int n = 4 + random.nextInt((10 - 4) / 2) * 2;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < i; j++) {
                matrix[i][j] = 0;
            }
            for (int j = i; j < matrix.length - i; j++) {
                matrix[i][j] = 1;
            }
            for (int j = matrix.length - i; j < matrix.length; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j =  0; j < matrix.length; j++) {
                matrix[matrix.length - i - 1][j] = matrix[i][j];
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
        int[][] matrix = generateMatrix();
        printMatrix(matrix);
        System.out.println();
    }
}

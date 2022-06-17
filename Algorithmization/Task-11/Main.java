package com.company;

import java.util.*;

public class Main {
    public static int[][] generateRandomMatrix() {
        int rows = (int) (Math.random() * 20) + 2;
        int columns = (int) (Math.random() * 20) + 2;
        int[][] matrix = new int[rows][columns];

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

    public static void printOddColumns(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < columns; i += 2) {
            if (matrix[0][i] > matrix[rows - 1][i]) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix();
        printMatrix(matrix);
        System.out.println();
        printOddColumns(matrix);
    }
}

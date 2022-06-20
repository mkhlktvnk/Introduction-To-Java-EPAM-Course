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
    
    public static void sortMatrixColumnsDecrease(int[][] matrix) {
        boolean isSorted = false;
        for (int i = 0; i < matrix[0].length; i++) {
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < matrix.length - 1; j++) {
                    if (matrix[j][i] < matrix[j + 1][i]) {
                        isSorted = false;
                        int tmp = matrix[j][i];
                        matrix[j][i] = matrix[j + 1][i];
                        matrix[j + 1][i] = tmp;
                    }
                }
            }
            isSorted = false;
        }
    }

    public static void sortMatrixColumnsIncrease(int[][] matrix) {
        boolean isSorted = false;
        for (int i = 0; i < matrix[0].length; i++) {
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < matrix.length - 1; j++) {
                    if (matrix[j][i] > matrix[j + 1][i]) {
                        isSorted = false;
                        int tmp = matrix[j][i];
                        matrix[j][i] = matrix[j + 1][i];
                        matrix[j + 1][i] = tmp;
                    }
                }
            }
            isSorted = false;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        printMatrix(matrix);
        System.out.println();
        sortMatrixColumnsIncrease(matrix);
        printMatrix(matrix);
        System.out.println();
        sortMatrixColumnsDecrease(matrix);
        printMatrix(matrix);

     }
}

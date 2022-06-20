package com.company;

import java.util.*;

public class Main {
    public static int[][] generateMatrix() {
        Random random = new Random();
        int rows = 2 + random.nextInt(10);
        int columns = 1 + random.nextInt(rows);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < i + 1 && j < rows; j++) {
                matrix[j][i] = 1;
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
     }
}

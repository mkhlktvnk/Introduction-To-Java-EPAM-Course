package com.company;

import java.util.*;

public class Main {
    public static int[][] generateMatrix() {
        Random random = new Random();
        int rows = 10;
        int columns = 20;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(15);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printRowsWithGivenValueRepetition(int[][] matrix, int value, int repetition) {
        for (int[] row : matrix) {
            int count = 0;
            for (int element : row) {
                if (element == value) {
                    count++;
                }
            }
            if (count >= repetition) {
                System.out.println(Arrays.toString(row));
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        printMatrix(matrix);
        System.out.println("\n");
        printRowsWithGivenValueRepetition(matrix, 5, 3);
     }
}

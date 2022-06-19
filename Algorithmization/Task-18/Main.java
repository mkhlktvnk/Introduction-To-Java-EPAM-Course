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
                matrix[i][j] = random.nextInt(10 / 2) * 2;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void swapColumns(int[][] matrix, int firstColumn, int secondColumn) {
        for (int i = 0; i < matrix.length; i++) {
            int tmp = matrix[i][firstColumn];
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = tmp;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        printMatrix(matrix);
        int firsColumn = 0, secondColumn = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.printf("first column number [0 - %d] = ", matrix[0].length - 1);
            firsColumn = scanner.nextInt();
            System.out.printf("second column number [0 - %d] = ", matrix[0].length - 1);
            secondColumn = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!\n");
            return;
        }
        if (firsColumn < 0 || secondColumn < 0 ||
                firsColumn > matrix[0].length || secondColumn > matrix[0].length) {
            System.out.println("Incorrect number of column!");
            return;
        }
        swapColumns(matrix, firsColumn, secondColumn);
        printMatrix(matrix);
     }
}

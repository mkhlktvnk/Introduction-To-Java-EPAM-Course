package com.company;

import java.util.*;

public class Main {
    public static int[][] generateMatrix() {
        Random random = new Random();
        int rows = 4;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = -10 + random.nextInt(10) * 2;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static ArrayList<Integer> getPositiveElementsOfMainDiagonal(int[][] matrix) {
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                positiveNumbers.add(matrix[i][i]);
            }
        }
        return positiveNumbers;
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        printMatrix(matrix);
        System.out.println(getPositiveElementsOfMainDiagonal(matrix));
     }
}

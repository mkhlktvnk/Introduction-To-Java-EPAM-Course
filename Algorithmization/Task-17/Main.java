package com.company;

import java.util.*;

public class Main {
    public static double[][] generateMatrix() {
        Random random = new Random();
        int n = 4 + random.nextInt((8 - 4) / 2) * 2;
        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / matrix.length);
            }
        }
        return matrix;
    }

    public static int countPositive(double[][] matrix) {
        int counter = 0;
        for (double[] elements : matrix) {
            for (double element : elements) {
                if (element > 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        double[][] matrix = generateMatrix();
        printMatrix(matrix);
        System.out.println(countPositive(matrix));
    }
}

package com.company;

import java.util.Arrays;

public class Main {
    public static int[][] createOddMagicSquare(int n) {
        int[][] matrix = new int[n][n];
        int i = 0;
        int j = n / 2;
        for (int k = 1; k <= n * n; k++) {
            matrix[i][j] = k;
            if (k % n == 0) {
                i++;
            } else {
                i--;
                j++;
                if (i < 0) {
                    i = n - 1;
                }
                if (j > n - 1) {
                    j = 0;
                }
            }
        }
        return matrix;
    }

    public static int[][] createEvenMagicSquare(int n) {
        int c1 = 1, c2 = n * n;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 4 == j % 4 || (i + j) % 4 == 3) {
                    matrix[i][j] = c2;
                } else {
                    matrix[i][j] = c1;
                }
            }
            c2--;
            c1++;
        }
        return matrix;
    }

    public static int[][] createEvenOddMagicSquare(int n) {
        int half = n / 2;
        int[][] matrix = new int[n][n];
        int[][] tempMatrix = createOddMagicSquare(half);
        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {
                matrix[i][j] = tempMatrix[i][j];
            }
        }
        for (int i = 0; i < half; i++) {
            for (int j = half; j < n; j++) {
                int x = j - half;
                matrix[i][j] = tempMatrix[i][x] + 2 * half * half;
            }
        }
        for (int i = half; i < n; i++) {
            for (int j = 0; j < half; j++) {
                int x = i - half;
                matrix[i][j] = tempMatrix[x][j] + 3 * half * half;
            }
        }
        for (int i = half; i < n; i++) {
            for (int j = half; j < n; j++) {
                int x = i - half;
                int y = j - half;
                matrix[i][j] = tempMatrix[x][y] + half * half;
            }
        }
        int move = 0;
        for (int i = 6; i < n; i++) {
            if ((i % 4 != 0) && (i % 2 == 0)) {
                move++;
            }
        }
        for (int j = matrix.length / 2 - move; j <= matrix.length / 2 + move - 1; j++) {
            for (int i = 0; i < tempMatrix.length; i++) {

                int key = matrix[i][j];
                matrix[i][j] = matrix[half + i][j];
                matrix[half + i][j] = key;
            }
        }
        for (int j = 0; j <= 1; j++) {
            if (j == 0) {
                int key = matrix[0][0];
                matrix[0][0] = matrix[half][0];
                matrix[half][0] = key;
            }
            if (j == 1) {
                int key = matrix[half - 1][0];
                matrix[half - 1][0] = matrix[n - 1][0];
                matrix[n - 1][0] = key;
            }
        }
        for (int j = half + 1; j < n - 1; j++) {
            for (int i = 1; i < half - 1; i++) {
                int key = matrix[i][1];
                matrix[i][1] = matrix[half + i][1];
                matrix[half + i][1] = key;
            }
        }
        return matrix;
    }

    public static int[][] createMagicSquare(int n) {
        if (n % 2 != 0) {
            return createOddMagicSquare(n);
        } else if (n % 4 != 0) {
            return createEvenOddMagicSquare(n);
        }
        return createEvenMagicSquare(n);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = createMagicSquare(4);
        printMatrix(matrix);
    }
}

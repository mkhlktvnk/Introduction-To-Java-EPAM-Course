package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0;
        try {
            System.out.print("m = ");
            m = scanner.nextInt();
            System.out.print("n = ");
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.printf("Value: %d, Delim: %d\n", i, j);
                }
            }
        }
    }
}

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean isBelongsToArea(double x, double y) {
        return x >= -4 && x <= 4 && y <= 4 && y >= -3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0;
        try {
            System.out.println("x = ");
            x = scanner.nextDouble();
            System.out.println("y = ");
            y = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
        }
        System.out.println(isBelongsToArea(x, y));
    }
}

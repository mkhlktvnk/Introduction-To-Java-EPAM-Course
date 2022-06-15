package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static double function(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Error! Division by zero!");
        }
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0.0, b = 0.0, c = 0.0;
        try {
            System.out.print("a = ");
            a = scanner.nextDouble();
            System.out.print("b = ");
            b = scanner.nextDouble();
            System.out.print("c = ");
            c = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("Incorrect input!");
            return;
        }
        double result = 0.0;
        try {
            result = function(a, b, c);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Result = " + result);
    }
}
